package Encapsulamento.src;
public class Televisao implements ControleTv {
    // Atributos
    private String marca;
    private boolean ligada;
    private int canal;
    private int volume;

    // Construtor
    public Televisao ( String marca, boolean ligada, int canal, int volume){
         this.marca = marca;
         this.ligada = false;
         this.canal = 1;
         this.volume = 10;
    }
    // get e set
    public void setmarca(String marca){
        this.marca = marca;

    }
    public String getmarca(){
       return marca;
    }
    public void setligada(boolean ligada){
        this.ligada = ligada;
    }
    public boolean getligada(){
        return ligada;
    }
    public void setcanal(int canal){
        this.canal = canal;
    }
    public int getcanal(){
        return canal;
    }
    public void setvolume(int volume){
        this.volume = volume;
    }
    public int getvolume(){
        return volume;
    }
    @Override
    public void desligarTv() {
        this.ligada = false;
        
    
    }

    @Override
    public void ligarTv() {
        this.ligada = true;
        System.out.println("Tv esta ligando");

    }

    @Override
    public void maisVolume() {
      if (ligada == false){
    
         System.out.println(" A televisão esta desligada, ligue a televisão para aumentar o volume ");
     
         return; 
      }
       if (volume >= 100){
         System.out.println("volume maximo");

         return;

       } 
       
        volume ++;
       
    }
    

    @Override
    public void menosVolume() {
        if ( this.ligada == false){
         
            System.out.println(" A televisão esta desligada, ligue para dominuir o volume!");

         return;
        }
        if( volume <= 0){
            System.out.println("volume minimo.");
        return;
        }
        volume --;
    }
                

    

    @Override
    public void mostrarStatus() {
        System.out.println("====== status ======");
        System.out.println("marca:" + marca);
        System.out.println("ligada:" + ligada);
        System.out.println("canal:" + canal);
        System.out.println("volume:" + volume);
    }

    @Override
    public void aumentarCanal() {
        if( this.ligada == false){
            System.out.println(" A televisão esta desligada, ligue a televisão para trocar canal!");
        return;
        }
        if(canal <= 0){
            System.out.println("canal invalido.");
        return;
        }
        canal ++;


        
    }


}

