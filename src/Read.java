import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {



    //-----------------------------------------------------------------------------------------
                                      //Tema - Try-Catch

    // 1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

    public int getInt(){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while (repeat){
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("The value ["+ scan.nextLine()+"] is not a numeric value,please try again");
            }
        }
        return number;
    }


    // 2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float getFloat(){
        Scanner scan = new Scanner(System.in);
        float number = 0;
        boolean repeat = true;
        while (repeat){
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextFloat();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("The value ["+ scan.nextLine()+"] is not a numeric value,please try again");
            }
        }
        return number;
    }

    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
























}

