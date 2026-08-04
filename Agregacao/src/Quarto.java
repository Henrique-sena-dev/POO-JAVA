package Agregacao.src;

public class Quarto {
    private boolean cortina;
    private String cor;

    public Quarto (String cor,boolean cortina){
      this.cor = cor;
      this.cortina = cortina;
    }
    
    public void setcortina(boolean cortina){
        this.cortina = cortina;
    }
    public boolean getcortina(){
        return cortina;
    }
    public void setcor(String cor){
        this.cor = cor;
    }
    public String getcor(){
        return cor;
    }
    public void abrirCortina(){
        cortina = true;
         System.out.println("cortina aberta");

    }
    public void fecharCortina(){
        cortina = false;
          System.out.println("cortina fechada");

    }
    public void status(){
        System.out.println(cor);
    }
    @Override

    public String toString(){
        return "Cor do quarto:" + cor
          +    "\nCortina aberta:" + cortina ;
    }

}