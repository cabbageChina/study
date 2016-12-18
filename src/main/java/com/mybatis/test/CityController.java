package com.mybatis.test;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
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
        city.setState(StateEnum.NOMAL);
        city.setCreateTime(LocalDateTime.now());
        city.setNums(Lists.newArrayList(1, 2, 3, 4, 5));
        cityMapper.insert(city);
        return cityMapper.find();
    }



}
