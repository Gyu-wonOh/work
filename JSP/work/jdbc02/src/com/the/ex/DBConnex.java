package com.the.ex;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.the.dao.HumanDao;
import com.the.dto.HumanDto;
import com.the.util.*;
public class DBConnex {
	public static HumanDao dao = new HumanDao();
	
	public static void main(String[] args) {
		
		//insert
		dao.insert(new HumanDto("홍길나",52,151.,LocalDateTime.now()));
		//update
		dao.update(50,"홍길나");
		//delete
		dao.delete("홍길나");
		//select
		ArrayList<HumanDto> humanDtos = dao.select();
		for(HumanDto dto:humanDtos) {
			System.out.println(dto);
		}
	}

}
