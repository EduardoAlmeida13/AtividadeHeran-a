package enitites;

public class Professor extends Pessoa{
    private Double salario;
    private String formaçao;

    public Professor(Double salario, String formaçao, String nome, Integer idade, char sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.formaçao = formaçao;
    }

    public Professor() {
        
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFormaçao() {
        return formaçao;
    }

    public void setFormaçao(String formaçao) {
        this.formaçao = formaçao;
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", forma\u00e7ao=" + formaçao + '}';
    }
    
    public void ensinar(){
        System.out.println("Ensinando!");
    }
}
