package exercicio2;

import exercicio1.Professor;
import exercicio1.Turma;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sobrecarga: dois ou mais métodos com o mesmo nome mas com tipos, posição ou número de argumentos diferentes (assinatura do método)");
        Turma turma = new Turma();
        Professor professor = new Professor();
        professor.cadastrarTurma(turma);
        professor.cadastrarTurma(turma,"modulo 1");

        System.out.println("Sobreposição: reescrever um método herdado da classe Pai");
        professor.toString();
    }
}
