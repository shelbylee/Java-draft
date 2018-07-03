package com.lxb.draft.designPattern.observerPattern;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    private WeatherData weatherData;

    private float minTemp = 0.0f;
    private float maxTemp = 200;
    private float tempSum = 0.0f;

    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp)
            maxTemp = temperature;

        if (temperature < minTemp)
            minTemp = temperature;

        display();
    }
}
