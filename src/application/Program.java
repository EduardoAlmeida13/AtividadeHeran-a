package application;

import enitites.Aluno;
import enitites.Bolsista;
import enitites.Pessoa;
import enitites.Professor;

public class Program {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Bolsista b = new Bolsista();
        
        p.setNome("Eduardo");
        p.setIdade(16);
        p.setSexo('M');

        a.setMat(9999999);
        a.setCurso("Informática");
        
        pr.setSalario(3000.00);
        pr.setFormaçao("Engenheiro");
        
        b.setDisciplina("Matemática!");
        
        System.out.println(p);
        System.out.println(a);
        System.out.println(pr);
        System.out.println(b);
    }
}
