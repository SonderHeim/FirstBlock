package base.fourthlesson;

public class TemperatureConverter {

    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15; // Вообще её можно было бы не объявлять, она не используется.
    public static final double BOILING_POINT_CELSIUS = 100.0;

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9) / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 100;
        boolean isAboveBoiling = celsius >= BOILING_POINT_CELSIUS;

        System.out.println(converter.celsiusToFahrenheit(celsius));

        if (isAboveBoiling) {
            System.out.println("Вода закипела!");
        } else {
            System.out.println("Вода не кипит!");
        }

        double fahrenheit = 50;

        System.out.println(fahrenheit);

        isAboveBoiling = fahrenheit >= BOILING_POINT_CELSIUS;

        if (isAboveBoiling) {
            System.out.println("Вода закипела!");
        } else {
            System.out.println("Вода не кипит!");
        }
    }

}