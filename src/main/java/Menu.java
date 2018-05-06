import java.util.Scanner;

public class Menu {

    boolean exit;

    int size = 2 * 1024 * 1024;

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.runMenu();
    }

    public void runMenu(){
        printHeader();

        while(!exit){
            printMenu();
            int option = getInput();
            runOption(option);
        }
    }

    private void printHeader(){
        System.out.println("*--------------------------*");
        System.out.println("|        Opdracht 5        |");
        System.out.println("|      Memory and data     |");
        System.out.println("*--------------------------*");
    }

    private void printMenu(){
        System.out.println("\nOptions:");
        System.out.println("1) OutOfMemoryError");
        System.out.println("2) StackOverflowError");
        System.out.println("3) Rounding Error");
        System.out.println("4) Bit switcher");
        System.out.println("5) Bit boolean");

        System.out.println("0) Exit");
        System.out.print("Enter a number: ");
    }

    private int getInput(){
        int option = -1;
        Scanner inputScanner = new Scanner(System.in);

        while (option < 0){
            try{
                option = Integer.parseInt(inputScanner.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid option. Please try again.");
            }
        }
        return option;
    }

    private void runOption(int option){
        switch(option){
            case 0:
                exit = true;
                System.out.println("Exiting");
                break;
            case 1:
                try {memoryError();}
                catch (OutOfMemoryError e){
                    System.out.println(e);
                }
                break;
            case 2:
                try {stackOverflowError();}
                catch (StackOverflowError e){
                    System.out.println(e);
                }
                break;
            case 3:
                roundingError();
                break;
            case 4:
                xor();
                break;
            case 5:
                bitBoolean();
                break;
            default:
                System.out.println("Oops something went wrong, ¯\\_(ツ)_/¯");
        }
    }

    private void memoryError(){
        int[] i = new int[size];
    }

    private void stackOverflowError(){
        stackOverflowError();
    }

    private void roundingError() {
        int i = 42;
        float f = 1.0f / i;
        System.out.println("Output with 42: = " + f * i + ", " + (i*f==1.0f));
        i--;
        f = 1.0f / i;
        System.out.println("Output with 41: = " + f * i + ", " + (i*f==1.0f));
        System.out.println("Floats are only so precise, this causes the answer to be slightly less than 1. " +
                "\nTry it with double and both would fail.");
    }

    private void xor() {
        System.out.println("\nOption 1: XOR (Exclusive or)");
        byte bit = 0;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            bit ^= 1;
        }
        bit = 0;
        System.out.println("Option 2: ?: Operator (still a if/else statement...");
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            bit = (byte) ((bit == 0) ? 1 : 0);
        }
    }

    private void bitBoolean(){
        System.out.println("\nOption 1: ! method");
        boolean bit = false;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            bit = !bit;
        }
        System.out.println("\nOption 2: Short if/else");
        bit = false;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            bit = ((bit == false) ? true : false);
        }
    }
}