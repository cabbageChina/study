package com.mybatis.test;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Eddú Meléndez
 */
@Mapper
public interface CityMapper {

	@Select("select * from city")
	List<City> find();

	@Insert("insert into city (name, state, country, createTime) values (#{name}, #{state}, #{country}, #{createTime})")
	int insert(City city);

}
