package com.the.dao;

import java.time.format.DateTimeFormatter;

import com.the.dto.HumanDto;
public class HumanDao {
	public void insert(HumanDto humanDto) {
		String sql = "insert into human values('%s',%d,%f,to_date('%s','YYYY-MM-DD HH24:MI:SS'))";
		sql= sql.format(sql, humanDto.getName(),
							humanDto.getAge(),
							humanDto.getHeight(),
							humanDto.getBirthday().format(
									DateTimeFormatter.ofPattern(pattern)
				);
		
	}

}
