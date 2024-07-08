package com.the.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.the.dto.UserDto;
import com.the.util.DBConn;

public class UserDao {
	public UserDto login (String id, String pw) {
		UserDto dto = new UserDto();
		String sql ="select * from shopuser where id in '%s' and pw in '%s'";
		sql = String.format(sql,id,pw);
		ResultSet rs = DBConn.statementQuery(sql);
		
		try {
			if(rs.next()) {
				String DBId= rs.getString("id");
				String DBPw = rs.getString("pw");
				
				dto = new UserDto(DBId,DBPw);
				System.out.println("id:" + DBId+"login");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public void insert(UserDto userDto) {
		String sql ="insert into shopuser values ('%s','%s','%s','%s',to_date('%s','YYYY-MM-DD HH24:MI:SS'),'%s','%s','%s')";
		sql=String.format(sql, 
				userDto.getId(),
				userDto.getPw(),
				userDto.getName(),
				userDto.getGender(),
				userDto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
				userDto.getEmail(),
				userDto.getPhoneNumber(),
				userDto.getAddress()
				);
		DBConn.statementUpdate(sql);
	}
	public ArrayList<UserDto> select() {
		ArrayList<UserDto> userDtos = new ArrayList<UserDto>();
		ResultSet rs = DBConn.statementQuery("select * from shopuser");
		try {
			while(rs.next()) {
				userDtos.add(new UserDto(rs.getString("id"),rs.getString("pw"),rs.getString("name"),rs.getString("gender"),
						rs.getTimestamp("birthday").toLocalDateTime(),rs.getString("email"),rs.getString("phoneNumber"),rs.getString("address")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDtos;
	}
	public void update(String id,String email,String phoneNumber, String address) {
		String sql ="update shopuser set email='%s',phoneNumber='%s',address='%s' where id= '%s'";
		sql = String.format(sql, email,phoneNumber,address,id);
		DBConn.statementUpdate(sql);
	}
	public void delete(String id) {
		String sql ="delete shopuser where id='%s'";
		sql=String.format(sql, id);
		DBConn.statementUpdate(sql);
	}
}
