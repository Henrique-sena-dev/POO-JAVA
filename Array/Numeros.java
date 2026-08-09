package Array;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos numeros: ");
        int num = ler.nextInt();
        
        double [] array = new double[num];

        double soma = 0;
        double maior =0;

        for (int i = 0; i < num; i++ ){
           array [i] = ler.nextDouble();
           System.out.println("array" + "[" + i + "]"  + " numero:" + array[i]);        
           soma += array[i];
          
        
           if (i == 0 ) {
            maior = array[i];
            
           } else if( array[i] > maior) {
             maior = array[i];
             


           }
        
        }
        System.out.println("A soma:" + soma);
        System.out.println("O maior número:" + maior);
        
         ler.close();
    
    }


}
