public class Menu {

    public static void main(String[] args){
        Menu menu = new Menu();
    }

    public void printHeader(){
        System.out.println("|--------------------------|");
        System.out.println("|        Opdracht 5        |");
        System.out.println("|      Memory and data     |");
        System.out.println("|--------------------------|");
    }

    public void printMenu(){
        System.out.println("Select one of the options");
        System.out.println("1) OutOfMemoryError");
        System.out.println("2) StackOverflowError");

        System.out.println("0) Exit");

    }
}