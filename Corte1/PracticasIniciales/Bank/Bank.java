package main;

//Clase que representa un banco
public class Bank {
    
    //El banco tiene dos cuentas como atributos
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
    
    //Constructor del banco: crea las dos cuentas
    public Bank(){
        
        //Se crean dos cuentas
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    //Metodo principal: aqui comienza el programa
    public static void main(String[] args){       
        Bank bankOfGods = new Bank();      //Se crea un banco (al hacerlo, el constructor crea las cuentas zeus y hades)
        
        //Imprime el saldo de accountOne
        //Como zeus empieza con 100, se imprime 100
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(5000);       //cambiamos el saldo de zeus a 5000
        System.out.println(bankOfGods.accountOne.getBalance());      //Imprimimos el saldo actualizado(5000
        
    }
    
}
