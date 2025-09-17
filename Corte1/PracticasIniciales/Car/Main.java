package carros;

public class Main {
    public static void main(String[] args) {
    //Metodo principal donde se ejecuta el programa
    //"public" se puede ejecutar desde cualquier lugar
    //"static" se puede ejecutar sun crear un objeto Main
    //"void" no devulve nada
    //"String[] args" arreglo de cadenas que puede recibir datos externos
        
        //CREAMOS OBJETOS CARROS
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        //Aqui usamos la clase "Car" como molde para crear 3 carros distintos
        
        //ASIGNAMOS DATOS A CADA CARRO
        car1.setCompany_name("Chevrolet");
        car1.setModel_name("Cruze");
        car1.setYear(2009);
        car1.setMileage(10000);
        //Asignamos valores a "car1" usando los metodos set
        
        car2.setCompany_name("Toyota");
        car2.setModel_name("Corolla");
        car2.setYear(2005);
        car2.setMileage(12500);
        
        car3.setCompany_name("Ford");
        car3.setModel_name("Focus");
        car3.setYear(2009);
        car3.setMileage(9000);
        
        //IMPRIMIMOS LA INFORMACION
        System.out.println("-------------------");
        System.out.println("Pimer Carro ");
        System.out.println("Company Name: " + car1.getCompany_name());
        System.out.println("Model Name: " + car1.getModel_name());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        System.out.println("-------------------");
        //Usamos los "getters" para obtener los valores y mostrarlos
        System.out.println("-------------------");
        System.out.println("Segundo Carro ");
        System.out.println("Company Name: " + car2.getCompany_name());
        System.out.println("Model Name: " + car2.getModel_name());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2.getMileage());
        System.out.println("-------------------");
        
        System.out.println("-------------------");
        System.out.println("Tercer Carro ");
        System.out.println("Company Name: " + car3.getCompany_name());
        System.out.println("Model Name: " + car3.getModel_name());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Mileage: " + car3.getMileage());
        System.out.println("-------------------");
    }
    
}
