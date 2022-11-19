package AnimalRescue;

public class Veterinary {
    private String name;
    private String specialization ;

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
