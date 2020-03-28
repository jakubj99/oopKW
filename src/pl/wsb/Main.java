package pl.wsb;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("DOG", 5.00);
        dog.name = "Borys";
        //  dog.species = "DOG";


//        System.out.println(dog.name);
//        System.out.println(dog.species);
//        System.out.println(dog.weight);

//        Double weightOfDogAfterFeeding = dog.feed();
//        System.out.println("fed dog weight: " + dog.weight);

        Phone iphone = new Phone("Apple", "8", 4.7);
//        iphone.producer = "Apple";
//        iphone.model = "8";
//        iphone.screenSize = 4.7;

        Car gietek = new Car("Volkswagen", "Polo", 2.0, 200, 100000.00);

        Human me = new Human();
        me.firsName = "Jakub";
        me.lastName = "Jankowski";
        me.pet = dog;
        me.mobile = iphone;
        me.vehicle = gietek;

//        System.out.println(me.pet.name);
//        System.out.println(me.pet.feed());
//        System.out.println(me.mobile.producer);

//        me.pet.walk();
//        me.pet.walk();
//        me.pet.walk();
//        me.pet.walk();
//        me.pet.walk();

        Human friendWithBenefits = new Human();
        friendWithBenefits.firsName = "Lana";
        friendWithBenefits.lastName = "Fala";
        friendWithBenefits.mobile = iphone;
        friendWithBenefits.vehicle = gietek;

        System.out.println(me);

    }


}
