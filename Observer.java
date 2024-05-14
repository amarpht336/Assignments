public class Observer {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver display1 = new Display();
        WeatherObserver display2 = new Display();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setMeasurements(25.5f, 60.2f);

    }
}
