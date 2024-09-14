import java.io.FileWriter;

public class FilePrinter extends PrinterDecorator {

    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    super.print(message);
    }
}
