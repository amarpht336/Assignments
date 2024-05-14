public class Display implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
