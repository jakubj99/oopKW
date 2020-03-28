package pl.wsb;

class Phone extends Device{


    private final Double screenSize;


    Phone(String producer, String model, Double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;
    }

    @Override
    void turnOn() {
        System.out.println("tu du du duuu");
    }


    @Override
    public void sell() {
        System.out.println("Phone - Sold!");
    }
}
