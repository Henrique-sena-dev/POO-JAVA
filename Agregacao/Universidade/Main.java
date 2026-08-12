package Agregacao.Universidade;

public class Main {
    
    public static void main(String[] args) {
        Aluno[] array = new Aluno[5];
        Professor p1 = new Professor("Jose", "Matemática");
        array [0] = new Aluno("Lelo", 26);
        Curso c1 = new Curso("Matematica", 3,p1,array[0]);
        c1.setAluno(array[0]);
        c1.setProfessor(p1);
        System.out.println(array[0]);


    }
}
