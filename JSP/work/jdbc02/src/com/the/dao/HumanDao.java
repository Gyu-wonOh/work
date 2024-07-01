package com.the.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.the.dto.HumanDto;
import com.the.util.DBConn;

public class HumanDao {

	public void insert(HumanDto humanDto) {

		String sql = "insert into human values('%s',"+"%d,%f,"
				+ "to_date('%s','YYYY-MM-DD HH24:MI:SS'))";
		sql =sql.format(sql,
				humanDto.getName(),
				humanDto.getAge(),
				humanDto.getHeight(),
				humanDto.getBirthday().format(
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
				);
		DBConn.statementUpdate(sql);
//		System.out.println(sql);
	}

	public void update(int age, String name) {
		String sql ="update human set age = %d where name='%s'";
		sql=String.format(sql, age,name);
		DBConn.statementUpdate(sql);
		
	}

	public void delete(String name) {
		DBConn.statementUpdate(String.format("delete human where name='%s'",name));		
	}

	public ArrayList<HumanDto> select() {
		ArrayList<HumanDto> humanDtos= new ArrayList<HumanDto>();
		ResultSet rs = DBConn.statementQuery("select*from human");
		try {
			while(rs.next()) {
				humanDtos.add(new HumanDto(
						rs.getString("name"),
						rs.getInt("age"),
						rs.getDouble("height"),
						rs.getTimestamp("birthday").toLocalDateTime()
					));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(HumanDto dto:humanDtos) {
			System.out.println(dto);
		}
		return humanDtos;
	}

}
