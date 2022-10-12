public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = (a+3);

        //int unu = adunare(a, b);
        System.out.println("Rezultatul adunarii este:" + adunare(a,b));

        int doi = scadere(a, b);
        System.out.println("Rezultatul scaderii este:" +(doi));

        int trei = inmultire(a, b);
        System.out.println("Rezultatul inmultirii este:" +(trei));

        float rezultatulImpartirii = impartire(a, b);
        System.out.println("Rezultatul impartirii este:" +(rezultatulImpartirii));
    }

    public static int adunare(int primul, int aldoilea) {
        int unu = primul + aldoilea;
        return unu;
    }

    public static int scadere(int primul, int aldoilea){
        int doi = primul - aldoilea;
        return doi;
    }
    public static int inmultire(int primul, int aldoilea){
        int trei = primul * aldoilea ;
        return trei;
    }
    public static float impartire(float primul, float aldoilea){
        float rezultatulImpartirii = primul / aldoilea ;
        return rezultatulImpartirii;
    }
}
