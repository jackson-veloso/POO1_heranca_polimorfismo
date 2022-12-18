import exercicio1.*;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.setNome("Gabriela");
        Professor professor2 = new Professor();
        professor2.setNome("Igor");

        Diretor diretor = new Diretor();
        diretor.setNome("ADA");

        Artigo artigo1 = new Artigo();
        artigo1.setTitulo("Artigo 1");
        artigo1.setAutor(professor1.getNome());

        Artigo artigo2 = new Artigo();
        artigo1.setTitulo("Artigo 2");
        artigo1.setAutor(professor2.getNome());

        Turma turma1 = new Turma();
        turma1.setNomeTurma("POO1");
        turma1.setPeriodo("modulo 1");

        Turma turma2 = new Turma();
        turma1.setNomeTurma("POO2");
        turma1.setPeriodo("modulo 2");

        //cadastrar artigos
        professor1.cadastrarArtigoPublicado(artigo1);
        professor2.cadastrarArtigoPublicado(artigo2);

        //cadastrar turma
        professor1.cadastrarTurma(turma1);
        professor2.cadastrarTurma(turma2);

        //exibir professores orientados pelo diretor
        diretor.orientarProfessor(professor1);
        diretor.orientarProfessor(professor2);
        diretor.exibirProfessoresOrientados();

        //exibir agenda detalhada
        Agenda agenda1 = new Agenda();
        agenda1.setTitulo("Agenda 1");
        agenda1.setDescricao("compromisso .... ...");
        professor1.setAgenda(agenda1);
        Secretario secretario = new Secretario();
        secretario.listarAgenda(professor1);

    }

}