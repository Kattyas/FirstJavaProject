import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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


    public int [] getArrayOfNumber(int length) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = getInt();
        }
        return array;
    }

    // 4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.

    public int getList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        boolean repeat = true;
       while (repeat){
           System.out.println();
           try {
               System.out.print("Please enter a number: ");
               myList.add(scan.nextInt());
           } catch (InputMismatchException e) {
               System.out.println("The value ["+ scan.nextLine()+"] is not a numeric value,please try again");
               if (scan.nextLine(). equals("Exit")){
                    repeat = false;
               }
           }
       }
        return myList.size();
    }











}

