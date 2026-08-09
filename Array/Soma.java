package Array;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

         double[] vect = new double[n];
         double soma = 0;
         
         for( int i = 0; i < n; i++ ){
            vect[i] = ler.nextDouble();
            soma += vect[i];

         }
         
         double media = soma / 3;
         System.out.printf("Média: %.2f%n", media);

         
         ler.close();
    }

    
}