package Agregacao.src;

public class Teste {
    public static void main (String [] args){
      Casa c1 = new Casa("Rua a", 3);
      Pessoa p1 = new Pessoa("lolo", 25);
      Quarto quarto = new Quarto("azul",true);
      Casa c2 = new Casa(" rua b", 2);
      Pessoa p2 = new Pessoa("Helena", 3);
      Quarto q2 = new Quarto("rosa",false);
      c1.setPessoa(p2);
      c2.setPessoa(p1);
      p1.setnome("Henrique");    
      System.out.println(c1);
      System.out.println(c2);
      


      
      



    }
    
}
