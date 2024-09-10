import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable{

    float temperature;
    void setTemperature() throws InterruptedException {
        float MaxTemperature = 50;
        float MinTemperature = -20;
        this.temperature = (float) (Math.random() * (MaxTemperature - MinTemperature) + MinTemperature);

        int weatherChange = Math.random() > 0.5 ? 1 : -1;
        this.temperature += weatherChange;

        notifyObservers(this.temperature);

        Thread.sleep((int) Math.random() *(5000 - 2000) +2000);

    }
    List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(float temperature) {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void run() {
        try {
            while (true) {
                setTemperature();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }

