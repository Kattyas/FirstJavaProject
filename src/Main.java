public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int x = 4;
        String textImput = "FastTrack";
        String textImput2 = "FastTrackIT";
        Calculator Calc = new Calculator();
        LogicalOp op = new LogicalOp();

        int adunare = Calc.operAdunare(a,b);
        System.out.println(adunare);
        int scadere = Calc.operScadere(a,b);
        System.out.println(scadere);
        int inmultire = Calc.operInmultire(a,b);
        System.out.println(inmultire);
        float impartire = Calc.operImpartire(a,b);
        System.out.println(impartire);

        int biggest = op.checkBiggerNumber(a,b);
        System.out.println("The bigger number is: " + biggest);

        String tComp = op.textComp(textImput);
        System.out.println(tComp);

        String TandNComp = op.textAndNumberComp(textImput2,b);
        System.out.println(TandNComp);

        String snow = op.theSnow(a);
        System.out.println(snow);

        String number = op.theNumber(a);
        System.out.println(number);

        String Case = op.switchCase(x);
        System.out.println(Case);

        String even = op.isNumberEven(a);
        System.out.println(even);

        String vote = op.isEligibleToVote(a);
        System.out.println(vote);

        int BiggestNumber = op.checkBiggestNumber(a,b,x);
        System.out.println(BiggestNumber);

    }




}




