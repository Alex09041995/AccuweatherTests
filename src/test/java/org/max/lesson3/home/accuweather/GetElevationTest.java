package org.max.lesson3.home.accuweather;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.home.accuweather.location.Elevation;
import org.max.lesson3.home.accuweather.location.Imperial;
import org.max.lesson3.home.accuweather.location.Metric;
import org.max.lesson3.seminar.accuweather.AccuweatherAbstractTest;


public class GetElevationTest extends AccuweatherAbstractTest {

    @Test
    public void checkGetMetric_Imperial() {
        Elevation elevation = new Elevation();
        Metric metric = new Metric();
        Imperial imperial = new Imperial();
        elevation.setMetric(metric);
        elevation.setImperial(imperial);
        Assertions.assertEquals(metric, elevation.getMetric());
        Assertions.assertEquals(imperial, elevation.getImperial());
    }
}

