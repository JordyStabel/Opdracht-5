public class Main {

    static final int SIZE=2*1024*1024;
    public static void main(String[] a) {
        int[] i = new int[SIZE];

        Main main = new Main();

        main.testMethod(1);
    }

    public void testMethod(int i) {
        testMethod(i);

        System.out.println(i);
    }
}