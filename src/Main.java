public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        int z = sum(x, y);
        System.out.println(z);

        float a = substract(x, y);
        System.out.println(a);

        float unu = multiply(x, y);
        System.out.println(unu);

        float doi = divide(y, x);
        System.out.println(doi);
    }

    public static int sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public static float substract(float first, float second){
        float result = first - second;
        return result;
    }
    public static float multiply(float first, float second ){
        float unu = first * second ;
        return unu;
    }
    public static float divide(float first, float second){
        float doi = first / second ;
        return doi;
    }
}
