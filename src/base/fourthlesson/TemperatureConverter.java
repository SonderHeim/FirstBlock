package base.fourthlesson;

public class TemperatureConverter {

    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double BOILING_POINT_CELSIUS = 100.0;

    public boolean isAboveBoiling = false;

    public double celsiusToFahrenheit(double celsius) {
        if (celsius >= BOILING_POINT_CELSIUS)
            isAboveBoiling = true;

        return (celsius * 9) / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;

        if (celsius >= BOILING_POINT_CELSIUS)
            isAboveBoiling = true;

        return celsius;
    }

}