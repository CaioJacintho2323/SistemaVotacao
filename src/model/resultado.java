package model;

public class resultado {
    private int totalVotos;
    private Candidato candidato;

    public resultado(Candidato candidato) {
        this.candidato = candidato;
        this.totalVotos = candidato.getVotos();
    }

    public double calcularPercentual(int totalGeral) {
        return (double) totalVotos / totalGeral * 100;
    }

    public void exibirResultado(int totalGeral) {
        System.out.printf("Candidato: %s, Votos: %d, Percentual: %.2f%%\n",
                candidato.getNome(), totalVotos, calcularPercentual(totalGeral));
    }
}
