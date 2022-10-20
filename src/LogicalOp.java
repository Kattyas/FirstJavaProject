public class LogicalOp {

    public int checkBiggerNumber(int a, int b ){
        if( a > b ){
            return a;
        } else {
            return b;
        }
    }
    public String textComp(String textImput){
        if (textImput.equals ("FastTrackIT")){
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
    public String textAndNumberComp(String textInput2, int b) {
        if (textInput2.equals("FastTrack") && b <= 3) {
            return textInput2 + b;
        } else if (!textInput2.equals("FastTrack") && b >= 4) {
            return b + textInput2;
        } else {
            return "No condition was met";
        }
    }
    public String theSnow(int a){
        if( a > 8 ||a==6){
            return "The amount of snow this winter was " + a +" cm ";
        }else {
            return "The forecast snow is" + a +" cm ";
        }
    }
    public String theNumber(int a) {
        if (a > 3 && a != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (a == 4) {
            return "The number is equal to 4";
        } else if (a < 3) {
            return "The number is lower than 3";
        }
        return null;
    }
    public String switchCase(int x){
        switch(x){
            case 1: return "The number is: 1 !";
            case 2: return "The number is: 2 !";
            case 3: return "The number is: 3 !";
            case 4: return "The number is: 4 !";
            case 5: return "The number is: 5 !";
            case 6: return "The number is: 6 !";
            case 7: return "The number is: 7 !";
            case 8: return "The number is: 8 !";
            case 9: return "The number is: 9 !";
            default: return "The number is not here";



        }

    }






}
