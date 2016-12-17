package com.mybatis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : cabbage
 */


@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityMapper cityMapper;


    @RequestMapping("/list")
    public List<City> findCity() {
        City city = new City();
        city.setName("小白");
        city.setCountry("中国");
        city.setState("正常");
        cityMapper.insert(city);
        return cityMapper.find();
    }



}
