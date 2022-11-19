public class Calculator {



    public int operAdunare(int a, int b ){
        return a + b;
    }
    public int operAdunare(int a, int b, int c ){
        return a + b + c;
    }
    public float operAdunare(float a, float b ){
        return a + b;
    }

    public int operScadere(int a, int b){
        return a - b;
    }
    public float operScadere(float a, float b){
        return a - b;
    }
    public float operScadere(float a, int b){
        return a - b;
    }


    public int operInmultire(int a, int b){
        return a * b;
    }
    public float operInmultire(float a, int b){
        return a * b;
    }
    public int operInmultire(int a, int b, int c){
        return a * b * c;
    }


    public float operImpartire(float a, float b){
        return a / b;
    }
    public double operImpartire(double a, double b){
        return a / b;
    }
    public double operImpartire(double a, float b){
        return a / b;
    }
}


