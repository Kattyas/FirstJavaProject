
public class Main3 {
    public static void main(String[] args) {

        Read read = new Read();
        System.out.println("The number introduced is: " + read.getInt());

        System.out.println("The number introduced is: " + read.getFloat());

        LogicalOp op = new LogicalOp();
        int[]myArray2 = read.getArrayOfNumber(5);
        op.prntArray(myArray2);

        Read r = new Read();
        r.getList();

        int[] arr = new int [] {2,4,44,37,54,63,72,81,90};
        int pozz = 5;
        System.out.println(" Pozz is...." + op.getArrayIndex2(arr,pozz));

        LogicalOp runn = new LogicalOp();
        runn.run();














    }
}
