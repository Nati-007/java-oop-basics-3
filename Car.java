public class Car {

    private String model;
    private String brand;
    private int year;

    public void  setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public Car() {
        this.model="M3";
    }
    public Car(String brand) {
        this.brand = "BMW";
    }
    public Car(int year) {
        this.year = 2020;
    }
    public Car(Car otherCar) {
        this.year = otherCar.year;
    }


    public String toString(){
        return " CAR {Model: "+getModel()+" , Brand: "+getBrand()+" , Year: "+getYear() + '}';
    }
}
