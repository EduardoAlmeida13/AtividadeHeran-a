package enitites;

public class Aluno extends Pessoa{
    private Integer mat;
    private String curso;

    public Aluno(Integer mat, String curso, String nome, Integer idade, char sexo) {
        super(nome, idade, sexo);
        this.mat = mat;
        this.curso = curso;
    }

    public Aluno() {
        
    }

    public Integer getMat() {
        return mat;
    }

    public void setMat(Integer mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "mat=" + mat + ", curso=" + curso + '}';
    }
    
    public void estudar(){
        System.out.println("Estudando!");
    }
    
}
