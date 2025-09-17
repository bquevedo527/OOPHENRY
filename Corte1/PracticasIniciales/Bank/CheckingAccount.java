package main;

//Esta clase es un cuenta bancaria
public class CheckingAccount {
    //Atributos privados (solo accesibles dentro de esta clase)
    private String name;    //nombre del dueño de la cuenta
    private int balance;    //saldo actual en la cuenta
    private String id;      //identificador unico de la cuenta
    
    //Constructor: se ejecuta cuando usamos "new CheckingAccount(...)"
    //Sirve para inicializar los atributos con los valores que le pasamos
    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;         //guarda o asigna el nombre recibido
        balance = inputBalance;   //asigna el saldo inicial
        id = inputId;             //asigna el id unico
    }
    
    //Metodo para obtener (leer) el saldo de la cuenta
    public int getBalance(){
        return balance;    //decuelva el valor de balance
    }
    
    //Metodo para cambiar el saldo de la cuenta
    public void setBalance(int newBalance){
        balance = newBalance;    //cambia el saldo al nuevo valor
    }
}
