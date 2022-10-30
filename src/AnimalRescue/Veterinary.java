package AnimalRescue;

public class Veterinary {
    private String name = "mrWilly";
    private String specialization = "cats&Dogs";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }






    public void consult(){
        System.out.println(" wants to know ");
    }
    public void ask(){
        System.out.println(" ...what, how, when...  ");
    }

}
