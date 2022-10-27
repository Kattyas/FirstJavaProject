public class LogicalOp {

    //In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    // si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare,
    // dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.

    public int checkBiggerNumber(int a, int b ){
        if( a > b ){
            return a;
        } else {
            return b;
        }
    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”

    public String textComp(String textImput){
        if (textImput.equals ("FastTrackIT")){
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

    public String theSnow(int a){
        if( a > 8 ||a==6){
            return "The amount of snow this winter was " + a +" cm ";
        }else {
            return "The forecast snow is" + a +" cm ";
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

    //Creati o metoda care sa se numeasca isNumberEven.
    // Metoda trebuie sa primeasca ca parametru un numar,
    // si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isNumberEven(int a){
        if (a % 2 ==0) {
            return "True";
        }else{
            return "False";
        }
    }

    //Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isEligibleToVote(int a){
        if (a >= 18 ) {
            return "True";
        }else{
            return "False";
        }
    }

    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int checkBiggestNumber(int a, int b, int x ){
        if( a > b || a > x){
            return a;
        }else if(b > a || b > x){
            return b;
        }else{
            return x;
        }

    }





    //--------------------------------------------------------------------------------------------------------------//
    //  Tema - Java For Loops


    // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromNrTo100(int nr){
        for(int x = nr; x <= 100; x++){
            System.out.println(x);
        }
    }
    // 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printFromNrToMinus100(int nrTwo){
        for(int x = nrTwo; x >= -100; x--){
            System.out.println(x);
        }
    }
    // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printFromAtoX(int x, int a){
        for(int i = x; i <= a; i++){
              System.out.println(i);
        }
    }
    // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    // o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
    // iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void theBgstNumber(int x, int a){

        for(int i = a; i >= x; x++){
            System.out.println(x);
        }
        for(int i = x; i >= a; a++){
            System.out.println(a);
        }
    }

    // 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void nrPare(int nrDoi){
        for(int i = nrDoi; i <= 100; i= i+2 ){
            System.out.println(i);
        }
    }
    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void nrImpare(int nrUnu){
        for(int i = nrUnu; (i % 2!= 0) && (i<=100) ; i++ ){
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
        return sum/100;
    }
    // 9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

    public void pattern(){
        for(int i = 7; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }














}
