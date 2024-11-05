package model;

public class Candidato extends Pessoa {
    private int numero;
    private int votos;

    public Candidato(String nome, int numero) {
        super(nome);
        this.numero = numero;
        this.votos = 0;
    }

    public void registrarVoto() {
        votos++;
    }

    public int getVotos() {
        return votos;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Candidato: " + nome + ", Número: " + numero + ", Votos: " + votos);
    }
}
