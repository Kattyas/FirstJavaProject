import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LogicalOp {

    //In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    // si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare,
    // dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.

    public int checkBiggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”

    public String textComp(String textImput) {
        if (textImput.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3,
    // returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
    // returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String textAndNumberComp(String textInput2, int b) {
        if (textInput2.equals("FastTrack") && b <= 3) {
            return textInput2 + b;
        } else if (!textInput2.equals("FastTrack") && b >= 4) {
            return b + textInput2;
        } else {
            return "No condition was met";
        }
    }

    // Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
    // “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String theSnow(int a) {
        if (a > 8 || a == 6) {
            return "The amount of snow this winter was " + a + " cm ";
        } else {
            return "The forecast snow is" + a + " cm ";
        }
    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati
    // “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.

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
    //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
    // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String switchCase(int x) {
        switch (x) {
            case 1:
                return "The number is: 1 !";
            case 2:
                return "The number is: 2 !";
            case 3:
                return "The number is: 3 !";
            case 4:
                return "The number is: 4 !";
            case 5:
                return "The number is: 5 !";
            case 6:
                return "The number is: 6 !";
            case 7:
                return "The number is: 7 !";
            case 8:
                return "The number is: 8 !";
            case 9:
                return "The number is: 9 !";
            default:
                return "The number is not here";
        }
    }

    //Creati o metoda care sa se numeasca isNumberEven.
    // Metoda trebuie sa primeasca ca parametru un numar,
    // si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isNumberEven(int a) {
        if (a % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }

    //Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isEligibleToVote(int a) {
        if (a >= 18) {
            return "True";
        } else {
            return "False";
        }
    }

    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int checkBiggestNumber(int a, int b, int x) {
        if (a > b || a > x) {
            return a;
        } else if (b > a || b > x) {
            return b;
        } else {
            return x;
        }

    }


    //--------------------------------------------------------------------------------------------------------------//
    //  Tema - Java For Loops


    // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromNrTo100(int nr) {
        for (int x = nr; x <= 100; x++) {
            System.out.println(x);
        }
    }
    // 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromNrToMinus100(int nrTwo) {
        for (int x = nrTwo; x >= -100; x--) {
            System.out.println(x);
        }
    }
    // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printFromAtoX(int x, int a) {
        for (int i = x; i <= a; i++) {
            System.out.println(i);
        }
    }
    // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    // o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
    // iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void theBgstNumber(int x, int a) {

        for (int i = a; i >= x; x++) {
            System.out.println(x);
        }
        for (int i = x; i >= a; a++) {
            System.out.println(a);
        }
    }

    // 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void nrPare(int nrUnu) {
        for (int i = nrUnu; (i % 2 == 0) && (i <= 100); i = i + 2) {
            System.out.println(i);
        }
    }
    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void nrImpare(int nrUnu) {
        for (int i = nrUnu; (i % 2 != 0) && (i <= 100); i++) {
            System.out.println(i++);
        }
    }
    // 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int addunare(int nrUnu) {
        int sum = 0;
        for (int i = nrUnu; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;

    }
    // 8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
    // metoda main() pentru a verifica daca functioneaza.

    public float addSiMedia(float nrUnu) {
        float sum = 0;
        for (float i = nrUnu; i <= 100; i++) {
            sum = sum + i;
        }
        return sum / 100;
    }
    // 9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

    public void pattern() {
        for (int i = 7; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //------------------------------------------------------------------------------------------------------------
    //  Tema - Java While Loop

    // 1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromFirstToLast(int nrUnu) {
        while (nrUnu <= 100) {
            System.out.println(nrUnu);
            nrUnu++;
        }
    }
    // 2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromNrToMinuss100(int nrUnu) {
        while (nrUnu >= -100) {
            System.out.println(nrUnu);
            nrUnu--;
        }
    }
    // 3.  Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void prntFromFirstToLast(int nrUnu, int nrOsuta) {
        while (nrUnu <= nrOsuta) {
            System.out.println(nrUnu);
            nrUnu++;
        }
    }
    // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void prntTheBgstNumber(int nrUnu, int b) {
        while (nrUnu >= b) {
            System.out.println(b);
            b++;
        }
        while (b >= nrUnu) {
            System.out.println(nrUnu);
            nrUnu++;
        }
    }
    // 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void nrParE(int nrUnu) {
        while (nrUnu <= 100) {
            if (nrUnu % 2 == 0) {
                System.out.println(nrUnu);
            }
            nrUnu++;
        }
    }

    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void nrImparE(int nrUnu) {
        while (nrUnu <= 100) {
            if (nrUnu % 2 == 1) {
                System.out.println(nrUnu);
            }
            nrUnu++;
        }
    }

    // 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
    // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda,
    // pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float mediaNumerelor(int first, int last) {
        float sum = 0;
        int count = 0;
        while (first <= last) {
            sum = sum + first;
            count++;
            first++;
        }
        return sum / count;
    }
    // 8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float medNrDiv(int first, int last) {
        float sum = 0;
        int count = 0;

        while ( first <= last ){
            if (first % 7 == 0){
                count++;
                sum = sum + first;
            }
            first++;
        }
        return sum / count;
    }


    // 9.  Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonaci20(int nrZero, int nrUnu){
        int i = 1;
        int n = 20;
        while (i <= n) {
            System.out.println(nrZero);
            int sum = nrZero + nrUnu;
            nrZero = nrUnu;
            nrUnu = sum;
            i++;
        }
    }
    // 10. Creati o metoda numita CozaLozaWoza.

    public void cozaLozaWoza(int nrOsutaZece){
        int i = 1;
        while (i <= nrOsutaZece) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
//----------------------------------------------------------------------------------------------------------------------
                                           // Tema - Java Arrays


    // 2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.


    public int[] arrayOfValues(int nrOsuta){
        int[] myArray = new int[nrOsuta];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        return myArray;
    }
    public void prntArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }

    }
    // 3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.


    public int[]evenArray(int nrOsuta){
        int[] myArray2 = new int[nrOsuta];
        for (int i = 0; i < myArray2.length; i++){
            myArray2[i] = i + 1;
        }
        return myArray2;
    }
    public void prntArray2(int []myArray2) {
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] % 2 == 0){
                System.out.println(myArray2[i]);
            }
        }
    }

    // 4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.


    public float getAverageFromArray(int[]myArray){

        float sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return sum/myArray.length;
    }

    // 5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.



    public boolean srcStrg() {
        String[] stringArray = new String[]{"A", "BE", "CE", "DE", "EF"};
        String searchedValue = "GE";

        boolean found = false;
        for(String i : stringArray){
            if(i.equals(searchedValue)){
                found = true;
                break;
            }
        }
        return found ;

    }

    // 6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int getArrayIndex(int[] arr, int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }

    // 7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void grid() {

        String[][] grid = new String[10][10];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                System.out.print("-");
            }
            System.out.println("-");
        }
    }

    // 8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void delAnItem() {

        int arr[] = new int[]{1, 3, 3, 4, 5, 6, 7, 8, 9};
        int elem = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // 9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.


    public int getSecondSmallest(){

        int arr[]={7,14,19,10,11,12,13};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    System.out.println();
                }
            }
        }
        return arr[1];
    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void copyArr(){
        int [] arr1 = new int [] {1, 2, 3, 4, 5};
        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of first array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Elements of second array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }


    //-----------------------------------------------------------------------------------------------------------------

                                             // Tema - Liste



    // 1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou.


    public void showTheList(List<Integer> mySecList){
        System.out.println(" 14. Tema - Liste : ");
        for(int i = 0; i< mySecList.size(); i++){
            System.out.println(mySecList.get(i));
        }

    }

    // 2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addANum(List<Integer> mySecList, int number){
        mySecList.add(number);
        System.out.println(mySecList);
    }

    // 3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListFromNumber(List<Integer> mySecList, int number){
        for(int i = number; i < mySecList.size(); i++){
            System.out.println(mySecList.get(i));
        }
    }

    // 4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, dar invers(de la capat la inceput).

    public void printListFromLast(List<Integer> mySecList){
        for(int i = mySecList.size()-1; i >= 0; i--){
            System.out.println(mySecList.get(i));
        }

    }
    // 5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addStringToList(List<String> myList, int position, String text){
        myList.add(position,text);
    }
    // 6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addNumTo1(List<Integer> mySecList, int number){
        mySecList.add(0,number);
        System.out.println(mySecList);
    }

    // 7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    //si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void showTheLists(List<Integer> mySecList){

        System.out.println(" Pe pozitia 0 valoarea este : " + mySecList.get(0));
        System.out.println(" Pe pozitia 1 valoarea este : " + mySecList.get(1));
        System.out.println(" Pe pozitia 2 valoarea este : " + mySecList.get(2));
        System.out.println(" Pe pozitia 3 valoarea este : " + mySecList.get(3));
        System.out.println(" Pe pozitia 4 valoarea este : " + mySecList.get(4));
        System.out.println(" Pe pozitia 5 valoarea este : " + mySecList.get(5));
    }

    // 8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public void showTheBigg(List<Integer> mySecList){
        int biggest = mySecList.get(0);
        for (int i = 0; i < mySecList.size(); i++) {
            if (biggest < mySecList.get(i));
            biggest = mySecList.get(i);

        }
        System.out.println("The biggest element in mySecList = " + biggest);
    }

//----------------------------------------------------------------------------------------------------------------------

                                       // Tema - Try-Catch

    // 5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".


    public int getArrayIndex2(int[] arr, int value) {

        try {
            System.out.println(" The value is ..." + arr[value]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Inside catch, number too large");
        }
        return value;
    }

    //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
    // In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde,
    // cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.

    public static void wait(int seconds){

        try {
            Thread.sleep(seconds * 1000L);
        }
        catch (InterruptedException e){
            System.out.println(e);;
        }
    }













}