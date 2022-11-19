package AnimalRescue;

public class Owner {

    private String name;
    private int money;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }


    public void adopt (){
        System.out.println("...goes to shelter");
    }
    public void laugh (){
        System.out.println("...soo happy");
    }
    public void speak(){
        System.out.println("Hello.....");
    }
    public void snore(){
        System.out.println("Hrrrr own...");
    }



}
