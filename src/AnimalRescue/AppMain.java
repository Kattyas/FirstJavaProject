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
        System.out.println("We have only " + yamYamFood.stock + " kg " + " of " + yamYamFood.name);
        System.out.println("Rudolph like "+ jumping.name);
        System.out.println("The name of the favorite food is " + yamYamFood.name);

        rudolph.eat();
        rudolph.sleep();
        rudolph.speak();
        rudolph.run();
        angelica.adopt();
        mrWilly.consult();





}
}
