package AnimalRescue;

public class Animal {

    private String name;
    private String breed;
    private String color;
    private String gender;
    private int age;
    private double weight;
    private int health;
    private int hungerLvl;
    private int happiness;



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }
    public int getHungerLvl() {
        return hungerLvl;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public int getHappiness() {
        return happiness;
    }

    public void eat(){
        System.out.println("Eating....aaaa");
    }
    public void sleep(){
        System.out.println("Hrrrr...Hrrrrr....");
    }
    public void speak(){
        System.out.println("Very loud.....");
    }
    public void run(){
        System.out.println("....very fast");
    }









}
