package Agregacao.Universidade;

public class Professor {
     private String Nome;
     private String Disciplina;
    
     public Professor(String nome, String disciplina){
         this.Nome = nome;
         this.Disciplina = disciplina;
     }
     public void setNome(String nome){
        this.Nome = nome;
     }
     public String getNome(){
        return Nome;
     }
    @Override
    public String toString(){
        return "Nome Professor:" + Nome
            +  "\nDisciplina:" + Disciplina;
    }
 }   

