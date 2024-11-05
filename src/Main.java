import model.Candidato;
import model.Eleitor;
import model.SistemaVotacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaVotacao sistema = new SistemaVotacao();


        Candidato candidato1 = new Candidato("Alice", 1);
        Candidato candidato2 = new Candidato("Bob", 2);
        sistema.adicionarCandidato(candidato1);
        sistema.adicionarCandidato(candidato2);

        Eleitor eleitor1 = new Eleitor("Carlos", "E001");
        Eleitor eleitor2 = new Eleitor("Diana", "E002");
        Eleitor eleitor3 = new Eleitor("Maria", "E003");
        sistema.adicionarEleitor(eleitor1);
        sistema.adicionarEleitor(eleitor2);
        sistema.adicionarEleitor(eleitor3);

        sistema.iniciarVotacao();
        sistema.registrarVoto(eleitor1,candidato2 );
        sistema.registrarVoto(eleitor2, candidato2);
        sistema.registrarVoto(eleitor3, candidato2);
        sistema.encerrarVotacao();

        sistema.mostrarResultados();
    }
}