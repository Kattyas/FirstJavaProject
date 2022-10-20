public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        Calculator Calc = new Calculator();

        System.out.println(Calc.operAdunare(a,b));
        System.out.println(Calc.operScadere(a,b));
        System.out.println(Calc.operInmultire(a,b));
        System.out.println(Calc.operImpartire(a,b));

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(a,b);
        System.out.println("The bigger number is: " + biggest);


        String textImput = "FastTrack";
        String textImput2 = "FastTrackIt";
        int numberImput = 5;
        System.out.println(op.textComp(textImput, textImput2));








    }




}




