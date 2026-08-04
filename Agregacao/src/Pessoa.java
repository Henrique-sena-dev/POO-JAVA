package Agregacao.src;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;

    }
    public void setnome(String nome){
          this.nome = nome;
    }
    public String getnome(){
        return nome;
    }

    public void setidade(int idade){
        this.idade = idade;
    } 
    public int getidade(){
        return idade;
    }

    public void falar(){
        System.out.println("xxx");

    }
    public void cumprimentar(){
         System.out.println("oi");

    }
    @Override
    public String toString(){
        return "Nome:" + nome
             + "\nidade:" + idade;
    }
}
