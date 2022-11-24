
public class Main3 {
    public static void main(String[] args) {

        Read read = new Read();
        System.out.println("The number introduced is: " + read.getInt());

        System.out.println("The number introduced is: " + read.getFloat());

        LogicalOp op = new LogicalOp();
        int[]myArray2 = read.getArrayOfNumber(5);
        op.prntArray(myArray2);














    }
}
