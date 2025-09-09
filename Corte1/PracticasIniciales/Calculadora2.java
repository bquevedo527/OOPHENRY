package calculadora2;

import java.util.Scanner;

public class Calculadora2 {

    public Calculadora2(){
    }
    public int add(int a, int b){
    return a + b;
    }
    
    public int substract(int a, int b){
    return a - b;
    }   
    
    public int multiply(int a, int b){
    return a * b;
    }       

    public double divide(int a, int b){
    return a / b;
    }
    
    public int modulo(int a, int b){
    return a%b;
    }
    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);
        
        System.out.print("Escriba el primer numero: ");
        int D1 =digito.nextInt();
        
        System.out.print("Escriba el segundo numero: ");
        int D2 =digito.nextInt();
        
        Calculadora2 myCalculadora2 = new Calculadora2();
        System.out.println(myCalculadora2.add(D1, D2));
        System.out.println(myCalculadora2.substract(D1, D2));
        System.out.println(myCalculadora2.multiply(D1, D2));
    }
    
}
