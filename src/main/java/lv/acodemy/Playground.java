package lv.acodemy;

public class Playground {
    public static void main(String[] arg) {

        Dog rex = new Dog();

        rex.setName("Rex");
        rex.setAge(1);


        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        Dog barsik = new Dog("alabai");

        barsik.setName("barsik");
        barsik.setAge(1);

        barsik.bark();
        barsik.feed();

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // ?? Print breed name through method

        System.out.println(barsik.getBreedName());
        System.out.println(rex.getBreedName());

        Dog akai = new Dog ("Akai",2,"Dog");
        System.out.println(akai);
        //to String()

        Cars whiteCar = new Cars("Audi");

        System.out.println(whiteCar);
        whiteCar.drive();
        System.out.println(whiteCar);
        whiteCar.refuel();
        System.out.println(whiteCar);
        whiteCar.service();
        System.out.println(whiteCar);
        whiteCar.showStatus();

    }
}
