package Agregacao.src;

public class Casa {
    private String endereco;
    private int comodos;
    private boolean porta;
    private Quarto quarto;
    private Pessoa pessoa;

    public Casa(String e, int c){
        this.endereco = e;
        this.comodos = c;

    }
    public void setendereco(String e){
        this.endereco = e;
    }
    public String getendereco(){
        return endereco;
    }
    public void setcomodos(int c){
        this.comodos = c;
    }
    public int getcomodos(){
        return comodos;

    }
     public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }
    public Quarto getQuarto(){
        return quarto;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa(){
        return pessoa;
    }

    public void abrirPorta(){
        porta = true;
        System.out.println("Abrindo porta");

    }
    public void ascenderLuz(){
        if(porta == true){
            System.out.println("luz ascessa");
        }
    }
    @Override
    public String toString(){
          return "Endereço:" + endereco
           + "\nComodos:" + comodos 
           + "\n" +  pessoa 
           + "\n" + quarto; 
               
     }
    }
