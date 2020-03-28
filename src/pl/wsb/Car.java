package pl.wsb;

public class Car extends Device{


    private Double engineCapacity;
    private int horsePower;
    double price;

    Car(String producer, String model, Double engineCapacity, int horsePower, double price) {
        super(producer, model);
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.price = price;
    }

    @Override
    void turnOn() {
        System.out.println("wrum wrum");
    }

    @Override
    public void sell() {
        System.out.println("Car - Sold!");
    }
}
