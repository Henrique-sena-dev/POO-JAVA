package MembrosStatic;

public class Calculadora {
    public int soma;

    public void somar(int a,int b){
         this.soma = a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multi(int a , int b){
        return a * b;
    }
    public String toString(){
        return "soma:" + soma;
    }
}
