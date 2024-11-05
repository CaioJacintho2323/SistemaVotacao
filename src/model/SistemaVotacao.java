package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaVotacao {
    private List<Candidato> candidatos = new ArrayList<>();
    private List<Eleitor> eleitores = new ArrayList<>();
    private boolean votacaoAtiva = false;

    public void iniciarVotacao() {
        votacaoAtiva = true;
        System.out.println("Votação iniciada.");
    }

    public void encerrarVotacao() {
        votacaoAtiva = false;
        System.out.println("Votação encerrada.");
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
        System.out.println("Candidato " + candidato.getNome() + " adicionado.");
    }

    public void adicionarEleitor(Eleitor eleitor) {
        eleitores.add(eleitor);
        System.out.println("Eleitor " + eleitor.getNome() + " adicionado.");
    }

    public void registrarVoto(Eleitor eleitor, Candidato candidato) {
        if (votacaoAtiva && !eleitor.verificarStatusVoto()) {
            eleitor.votar(candidato);
        } else {
            System.out.println("Votação não está ativa ou eleitor já votou.");
        }
    }

    public void mostrarResultados() {
        System.out.println("Resultados da Votação:");
        int totalVotosGeral = candidatos.stream().mapToInt(Candidato::getVotos).sum();
        for (Candidato candidato : candidatos) {
            resultado resultado = new resultado(candidato);
            resultado.exibirResultado(totalVotosGeral);
        }
    }
}
