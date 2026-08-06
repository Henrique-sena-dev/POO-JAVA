package Agregacao.Universidade;

public class Curso {
    private String nomeCurso;
    private int cargaHoraria;
    private Professor professor;
    private Aluno aluno;
  
    public Curso(String nomeC, int cargaH,Professor professor, Aluno aluno){
       this.nomeCurso = nomeC;
       this.cargaHoraria = cargaH;
       this.professor = professor;
       this.aluno = aluno;
    }
    public void setnomeCurso(String nomeC){
        this.nomeCurso = nomeC;
    }
    public String getnomeCurso(){
        return nomeCurso;
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    public Aluno getAluno(){
        return aluno;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return professor;
    }

    @Override
    public String toString(){
        return "Nome curso:" + nomeCurso
             + "\nCarga Horária:" + cargaHoraria + " horas"
             + "\n" + professor 
             + "\n" + aluno;
    }
}
