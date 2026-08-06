package Agregacao.Universidade;

public class Aluno {
    private String Nome;
    private int Idade;

    public Aluno(String nome,int idade){
       this.Nome = nome;
       this.Idade = idade;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getNome(){
        return Nome;
    }
    public void setIdade(int idade){
        this.Idade = idade;
    }
    public int getIdade(){
        return Idade;
    }
    @Override
    public String toString(){
        return "Nome Aluno:" + Nome
            +  "\nIdade:" + Idade;
    }
}
