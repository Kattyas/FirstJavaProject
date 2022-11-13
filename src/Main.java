public class Main {

    public static void main(String[] args) {


        int nrZero      = 0;
        int nrUnu       = 1;
        int nrDoi       = 2;
        int nrUnspe     = 11;
        int a           = 20;
        int b           = 15;
        int x           = 4;
        int nrOsuta     = 100;
        int nrOsutaZece = 110;


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

        //--------------------------------------------------------------------------------------------
        // Tema 12

        LogicalOp nr = new LogicalOp();
        nr.printFromNrTo100(x);

        LogicalOp nrTwo = new LogicalOp();
        nrTwo.printFromNrToMinus100(x);

        LogicalOp numaratoare = new LogicalOp();
        numaratoare.printFromAtoX(x,a);

        LogicalOp crescator = new LogicalOp();
        crescator.theBgstNumber(a,x);

        LogicalOp nrP = new LogicalOp();
        nrP.nrPare(nrDoi);

        LogicalOp nrImp = new LogicalOp();
        nrImp.nrImpare(nrUnu);

        int aDunare = op.addunare(nrUnu);
        System.out.println(aDunare);

        float sumAndAv = op.addSiMedia(nrUnu);
        System.out.println(sumAndAv);

        LogicalOp tipar = new LogicalOp();
        tipar.pattern();

        //-----------------------------------------------------------------------------------------------------------

        LogicalOp prnt = new LogicalOp();
        prnt.printFromFirstToLast(nrUnu);

        LogicalOp prnt2 = new LogicalOp();
        prnt2.printFromNrToMinuss100(nrUnu);

        LogicalOp prnt3 = new LogicalOp();
        prnt3.prntFromFirstToLast(nrUnu, nrOsuta);

        LogicalOp prnt4 = new LogicalOp();
        prnt4.prntTheBgstNumber(nrUnu, b);

        LogicalOp prnt5 = new LogicalOp();
        prnt5.nrParE(nrUnu );

        LogicalOp prnt6 = new LogicalOp();
        prnt6.nrImparE(nrUnu);

        LogicalOp prnt7 = new LogicalOp();
        System.out.println(prnt7.mediaNumerelor(111, 8899));

        LogicalOp prnt8 = new LogicalOp();
        System.out.println(prnt8.medNrDiv(1, 100));

        LogicalOp prnt9 = new LogicalOp();
        prnt9.fibonaci20(nrZero,nrUnu);

        LogicalOp prnt10 = new LogicalOp();
        prnt10.cozaLozaWoza(nrOsutaZece);

        //______________________________________________________________________________________________________________


        int[] myArray = op.arrayOfValues(100);
        op.prntArray(myArray);

        int[] myArray2 = op.evenArray(nrOsuta);
        op.prntArray2(myArray2);

        System.out.println(op.getAverageFromArray(myArray));

        System.out.println(op.srcStrg());



        int[] arr = new int [] {1,2,3,4,5,6,7,8,9};
        int value = 5;
        System.out.println(op.getArrayIndex(arr,value));
        if (value <= arr.length) {
            System.out.println(" True ");
        }else{
            System.out.println(" False ");
        }

        LogicalOp patt = new LogicalOp();
        patt.grid();

        LogicalOp dell = new LogicalOp();
        dell.delAnItem();

        int k[]={7,8,9,10,11,12,13};
        System.out.println(op.getSecondSmallest(k,7));





























    }
}




