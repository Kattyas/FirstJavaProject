public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int x = 4;
        Calculator Calc = new Calculator();

        int adunare = Calc.operAdunare(a,b);
        System.out.println(adunare);
        int scadere = Calc.operScadere(a,b);
        System.out.println(scadere);
        int inmultire = Calc.operInmultire(a,b);
        System.out.println(inmultire);
        float impartire = Calc.operImpartire(a,b);
        System.out.println(impartire);

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(a,b);
        System.out.println("The bigger number is: " + biggest);

        String textImput = "FastTrack";
        String textImput2 = "FastTrackIT";
        System.out.println(op.textComp(textImput));

        System.out.println(op.textAndNumberComp(textImput2, b));

        System.out.println(op.theSnow(a));

        System.out.println(op.theNumber(a));

        System.out.println(op.switchCase(x));

        System.out.println(op.isNumberEven(a));

        System.out.println(op.isEligibleToVote(a));

        System.out.println(op.checkBiggestNumber(a,b,x));









    }




}




