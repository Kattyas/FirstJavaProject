public class LogicalOp {

    public int checkBiggerNumber(int a, int b ){
        if( a > b ){
            return a;
        } else {
            return b;
        }
    }
    public String textComp(String textImput, String textImput2){
        if (textImput.equals (textImput2)){
            return "Learning text comparison";
        } else{
            return "Got to try some more";
        }
    }
}
