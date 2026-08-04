package Agregacao.src;

public class Casa {
    private String endereco;
    private int comodos;
    private boolean porta;

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

    public void abrirPorta(){
        porta = true;
        System.out.println("Abrindo porta");

    }
    public void ascenderLuz(){
        if(porta == true){
            System.out.println("luz ascessa");
        }
    }
    
}
