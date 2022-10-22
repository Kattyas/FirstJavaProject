package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rudolph    = new Dog();
        Owner angelica = new Owner();
        AnimalFood yamYamFood = new AnimalFood();
        RecAct jumping = new RecAct();
        Veterinary mrWilly = new Veterinary();


        System.out.println("The dog's name is: " + rudolph.name);
        System.out.println("The dog's age is: "+ rudolph.age + " years ");
        System.out.println("The dog's weight is: " + rudolph.weight + " kg ");
        System.out.println(yamYamFood.stock + " kg");

        rudolph.eat();
        rudolph.sleep();
        rudolph.speak();
        rudolph.run();
        angelica.adopt();
        mrWilly.ask();




}
}
