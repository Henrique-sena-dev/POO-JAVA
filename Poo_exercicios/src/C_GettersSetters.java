package src;

public class C_GettersSetters {
    
    private String nome;
    private int idade;

    public void setNome(String nomepessoa){
        this.nome = nomepessoa;

    }

    public String getNome(){
      return nome;
    
    }

    public void setIdade(int idadePessoa){
        this.idade = idadePessoa;
    }

    public int getIdade(){
        return idade;
    }

    public void status(){
        System.out.println("===== Dados =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());

    }
    





}
