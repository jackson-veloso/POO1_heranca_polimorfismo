package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{
    private List<Professor> professoresOrientados;


    public Diretor() {
        this.professoresOrientados = new ArrayList<>();
    }

    public List<Professor> getProfessoresOrientados() {
        return professoresOrientados;
    }

    public void setProfessoresOrientados(List<Professor> professoresOrientados) {
        this.professoresOrientados = professoresOrientados;
    }

    public void orientarProfessor(Professor professor){
        this.professoresOrientados.add(professor);
    }

    public void exibirProfessoresOrientados(){
        for (int i=0;i<professoresOrientados.size();i++){
            System.out.println(professoresOrientados.get(i).getNome());
        }
    }

}
