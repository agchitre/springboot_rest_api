package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.api.CityApiDelegate;
import com.example.demo.model.City;

@Service
public class CityApiDelegateImpl implements CityApiDelegate {

    @Override
    public ResponseEntity<City> getCityByCode(String citycode) {
        City city = new City();

        city.setId(123L);
        city.setCitycode("KA");
        city.setCityName("Kirkland");
        city.setState("Washington");

        return ResponseEntity.ok(city);
    }
}

