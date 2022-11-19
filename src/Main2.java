public class Main2 {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;
        int e = 10;
        int f = 12;
        int g = 14;

        Calculator Calc = new Calculator();

        int adunare = Calc.operAdunare(a,b);
        System.out.println(adunare);
        int scadere = Calc.operScadere(a,b);
        System.out.println(scadere);
        int inmultire = Calc.operInmultire(a,b);
        System.out.println(inmultire);
        float impartire = Calc.operImpartire(a,b);
        System.out.println(impartire);













    }

}
