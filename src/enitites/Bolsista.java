package enitites;

public class Bolsista extends Aluno{
    private String disciplina;

    public Bolsista(String disciplina) {
        this.disciplina = disciplina;
    }

    public Bolsista() {
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Bolsista{" + "disciplina=" + disciplina + '}';
    }

    public void perquisar(){
        System.out.println("Pesquisando!");
    }
}
