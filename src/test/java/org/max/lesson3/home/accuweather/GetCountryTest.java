package org.max.lesson3.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.home.accuweather.location.Country;
import org.max.lesson3.seminar.accuweather.AccuweatherAbstractTest;


public class GetCountryTest extends AccuweatherAbstractTest {

    @Test
    public void checkGetCountry() throws Exception {
        Country country = new Country();
        country.setId("RU");
        country.setLocalizedName("Российская Федерация");
        country.setEnglishName("Russian Federation");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(country);
        Country deserializedCountry = objectMapper.readValue(json, Country.class);
        Assertions.assertEquals(country.getId(), deserializedCountry.getId());
        Assertions.assertEquals(country.getEnglishName(), deserializedCountry.getEnglishName());
        Assertions.assertEquals(country.getLocalizedName(), deserializedCountry.getLocalizedName());
    }
}
