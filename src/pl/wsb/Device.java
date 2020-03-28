package pl.wsb;

public abstract class Device implements Soldable {

    String producer;
    String model;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    abstract void turnOn();



}
