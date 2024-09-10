public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger
    }
}