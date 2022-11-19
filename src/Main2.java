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

        float adunare = Calc.operAdunare(a,b);
        System.out.println(adunare);
        System.out.println(a+b+c);
        System.out.println(a + b);


        float scadere = Calc.operScadere(a,b);
        System.out.println(scadere);
        System.out.println(a-b);


        float inmultire = Calc.operInmultire(a,b);
        System.out.println(inmultire);
        System.out.println(a*b);
        System.out.println(a*b*c);


        double impartire = Calc.operImpartire(a,b);
        System.out.println(impartire);
        System.out.println(b/a);













    }

}
