package com.lxb.draft.designPattern.observerPattern.observerable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

   // private Observable observable;

    private float minTemp = 0.0f;
    private float maxTemp = 200;
    private float tempSum = 0.0f;

    private int numReadings;

    public StatisticsDisplay(Observable observable) {
      //  this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {

            WeatherData weatherData = (WeatherData)o;

            float temp = weatherData.getTemperature();

            tempSum += temp;
            numReadings++;

            if (temp > maxTemp)
                maxTemp = temp;

            if (temp < minTemp)
                minTemp = temp;

            display();
        }
    }
}
