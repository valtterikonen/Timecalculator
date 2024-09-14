public class Main {

    public static void main(String[] args) {
        Printer Printer = new BasicPrinter();
        Printer.print("Hello World!");

        Printer Printer2 = new EncryptedPrint(new FilePrinter(new BasicPrinter()));
        Printer2.print("Hello World!");
    }
}
