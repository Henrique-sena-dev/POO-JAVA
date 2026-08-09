package MembrosStatic;

public class Main {
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
       
        System.out.println(Calculadora.subtrair(11,10));
       // System.out.println(Calculadora.somar(5,5));    
        System.out.println(Calculadora.multi(2,4));
        
        c.somar(5,5);
        System.out.println(c);
    }
}
