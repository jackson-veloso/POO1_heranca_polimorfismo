package exercicio1;

public class Secretario extends Funcionario {
    public void listarAgenda(Funcionario funcionario) {
        System.out.println(funcionario.getAgenda().toString());
    }
}
