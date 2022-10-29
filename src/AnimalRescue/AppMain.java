package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rudolph    = new Dog();
        rudolph.setName("Rudolph");
        rudolph.setAge(6);
        rudolph.setWeight(30.5);
        rudolph.setBreed("Husky");


        Owner angelica = new Owner();
        AnimalFood yamYamFood = new AnimalFood();
        RecAct jumping = new RecAct();
        Veterinary mrWilly = new Veterinary();


        System.out.println("The dog's name is: " + rudolph.getName());
        System.out.println("The dog's age is: "+ rudolph.getAge() + " years ");
        System.out.println("The dog's weight is: " + rudolph.getWeight() + " kg ");
        System.out.println("We have only " + yamYamFood.stock + " kg " + " of " + yamYamFood.name);
        System.out.println("Rudolph like "+ jumping.name);
        System.out.println("The name of the favorite food is " + yamYamFood.name);

        rudolph.eat();
        rudolph.sleep();
        rudolph.speak();
        rudolph.run();
        angelica.adopt();
        yamYamFood.spicy();
        jumping.high();
        mrWilly.consult();





}
}
