package pl.wsb;

import java.io.File;

class Animal implements Soldable, Edible{

    public String name;
    final String species;
    private Double weight;
    File pic;

    Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

//    void feed(){
//        System.out.println("thx for food");
//        weight += 1;
//    }

    Double feed() {
        System.out.println("thx for food");
        return ++weight;
    }

    void walk() {

        if (weight > 4.0) {
            System.out.println("thx for walk");
            --weight;
        } else if (weight > 1.0) {
            System.out.println("Feed your pet.");
            --weight;
        } else {
            System.out.println("It's too late {{RIP}}");
        }
    }


    @Override
    public void sell() {
        System.out.println("Now give me money.");
    }

    @Override
    public void eat() throws Exception {
        System.out.println("That was yummy");
    }
}
