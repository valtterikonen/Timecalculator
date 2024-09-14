public class EncryptedPrint extends PrinterDecorator{

    public EncryptedPrint(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        System.out.println("");
        super.print(message);
        String encryptedMessage = encrypt(message);
        super.print("Encrypted version: " + encryptedMessage);
    }

    private String encrypt(String message) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += 3;
        }
        return new String(chars);
    }

}
