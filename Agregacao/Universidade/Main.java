package Agregacao.Universidade;

public class Main {
    
    public static void main(String[] args) {
        Professor p1 = new Professor("Jose", "Matemática");
        Aluno a1 = new Aluno("Lelo", 26);
        Curso c1 = new Curso("Matematica", 3,p1,a1);
        c1.setAluno(a1);
        c1.setProfessor(p1);
        System.out.println(c1);


    }
}
