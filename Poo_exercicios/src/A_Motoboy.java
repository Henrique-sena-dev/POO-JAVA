package src;

public class A_Motoboy {
     
      private String nome;
      private int idade;
      public String cidade;
      public String moto; 
      protected boolean ativo;
      private boolean motoLigada;
      private int entregasHoje;
      
      

      public A_Motoboy(String nome, int idade, boolean ativo){
         this.nome = nome;
         this.idade = idade;
         

      }

      public void status(){
          System.out.println("=======================");
          System.out.println("    Sobre o motoboy    ");
          System.out.println("=======================");
          System.out.println("Nome: " + nome);
          System.out.println("Idade: " + idade);
          System.out.println();
      }

      public void ficarOnline(){
         ativo = true;
         System.out.println("Motoboy online");

      }
      public void ficarOffline(){
        ativo = false;
        System.out.println("Motoboy offline");

      }

      public void desligarmoto(){
         motoLigada = false;

      }
      public void ligarmoto(){
        
      }
       
}
