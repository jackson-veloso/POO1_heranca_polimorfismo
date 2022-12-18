package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<Artigo> artigosPublicados;
    private List<Turma> turmasPeriodo;

    public List<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }

    public Professor() {
        this.artigosPublicados = new ArrayList<>();
        this.turmasPeriodo = new ArrayList<>();
    }

    public void setArtigosPublicados(List<Artigo> artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }

    public void cadastrarArtigoPublicado(Artigo artigoPublicado) {
        this.artigosPublicados.add(artigoPublicado);
    }

    public List<Turma> getTurmasPeriodo() {
        return turmasPeriodo;
    }

    public void setTurmasPeriodo(List<Turma> turmasPeriodo) {
        this.turmasPeriodo = turmasPeriodo;
    }

    public void cadastrarTurma(Turma turma) {
        this.turmasPeriodo.add(turma);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "artigosPublicados=" + artigosPublicados +
                ", turmasPeriodo=" + turmasPeriodo +
                '}';
    }
}
