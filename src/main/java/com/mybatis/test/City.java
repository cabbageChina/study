package com.mybatis.test;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Eddú Meléndez
 */
@Data
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String country;

	private StateEnum state;

	private List<Integer> nums;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;

}
