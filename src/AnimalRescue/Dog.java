package AnimalRescue;

public class Dog {



    private String name;
    private int age;
    private String breed;
    String color = "Blue";
    private double weight;
    String gender = "Male";
    int healthLvl = 9;
    int hungerLvl = 3;
    int happiness = 7;



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

    public void eat(){
        System.out.println("Eating....");
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


