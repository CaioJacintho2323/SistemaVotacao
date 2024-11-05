package model;

public class Eleitor extends Pessoa implements Votavel {
    private String idEleitor;
    private boolean jaVotou = false;

    public Eleitor(String nome, String idEleitor) {
        super(nome);
        this.idEleitor = idEleitor;
        this.jaVotou = jaVotou;
    }

    @Override
    public void votar(Candidato candidato) {
        if (!jaVotou) {
            candidato.registrarVoto();
            jaVotou = true;
            System.out.println(nome + " votou no candidato " + candidato.getNome());
        } else {
            System.out.println(nome + " já votou e não pode votar novamente.");
        }
    }

    @Override
    public void obterInformacoes() {
        System.out.println("Eleitor: " + nome + ", ID: " + idEleitor + ", Já votou: " + jaVotou);
    }

    public boolean verificarStatusVoto() {
        return jaVotou;
    }

    @Override
    public void exibirInformacoes() {

    }
}
