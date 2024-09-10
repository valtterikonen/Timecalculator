public class WeatherObserver implements Observer{

    private String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    public void update(float temperature) {
        System.out.println(name + " temperature updated to: " + String.format("%.1f", temperature) + " celsius");
    }
}
