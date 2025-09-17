package carros;

class Car {
//Una calse es como un molde o plano que describe como es un objeto "Carro"
//Apartir de esta clase podremos crear varios objetos(Carros diferentes)
    private String company_name;
    //Atributo privado que guarda el nombre de la compañia
    //"private" significa que SOLO se puede acceder dentro de esta clase
    private String model_name;    //atributro privado, gusrda el modelo de carro
    private int year;             //atributro privado que guarda el año 
    private double mileage;       //"double" porque puede tener decimales
    
    
    //METODO GET (obtener valor)
    public String getCompany_name() {
    return company_name;    //Devuelve el nombre de la compañia del carro
    }

    //METODO SET(cambiar valor)
    public void setCompany_name(String company_name) {
    this.company_name = company_name;
    //Cambia valor de "company_name"
    //"this.company_name" se refiere al atributro de la clase
    //"company_name" (sin this) es el parametro que recibe el metodo
    }

    public String getModel_name() {
    return model_name;     //Devuelve modelo del carro
    }

    public void setModel_name(String model_name) {
    this.model_name = model_name;  //cambia el valor de "model_name"
    }
  
    public void setMileage(double mileage) {
      this.mileage = mileage;     //cambia valor de kilometraje
    }

    public int getYear() {
    return year;     //Devuleve año del carro
    }

    public void setYear(int year) {
    this.year = year;     //cambia el año del carro
    }

    public double getMileage() {
    return mileage;     //Devuelve kilometraje del carro
    }
    
}
