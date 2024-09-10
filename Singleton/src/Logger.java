import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private BufferedWriter writer;
    private String logName = "log.txt";

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String newLogName) {
        try {
            if (writer != null) {
                writer.close();
            }
            logName = newLogName;
            writer = new BufferedWriter(new FileWriter(logName, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}