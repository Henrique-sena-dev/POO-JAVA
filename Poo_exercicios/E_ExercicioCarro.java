package poo_exercicios;

public class E_ExercicioCarro {
  
  private String modelo;
  private int ano;
  private boolean ignicao = false;

  public void setModelo( String modeloCarro){
    this.modelo = modeloCarro;

  }

  public String getModelo(){
    return modelo;
  }


  public void setAno(int anoCarro){
    this.ano = anoCarro;

  }
  public int getAno(){
    return ano;
  }
  
   public void setIgnicao(boolean ignicao ){
    this.ignicao = ignicao;
    
   }
   public boolean getIgnicao(){
    return ignicao;
   }
   public void ligarCarro(){
     System.out.println("Carro ligado");

   }
   
  
  
  public void status(){
    System.out.println("===== informações =====");
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println();
    System.out.println();
  } 

  
  
  






}
