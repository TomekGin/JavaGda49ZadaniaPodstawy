public class Task1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
    }

    private static void displayWordUsingDecimalFormat() {
        // ASCII table
        char s = 0b01010011; // bin
        char d = 68; // dec
        char a = 0x41; // hexp

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

}
