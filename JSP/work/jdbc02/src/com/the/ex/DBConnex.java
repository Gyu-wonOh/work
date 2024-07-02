package com.the.ex;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.the.dao.HumanDao;
import com.the.dto.HumanDto;
import com.the.service.HumanService;
import com.the.util.*;
public class DBConnex {
//	public static HumanDao dao = new HumanDao();
	public static HumanService humanservice= new HumanService();
	public static void main(String[] args) {
		//이걸 이용해서 human 관리프로그램 구현
		int input = 0;//메뉴를 선택하는 변수
		
		String menuStr="관리프로그램>>\n";
		menuStr += "1. select 2. insert 3. update 4.delete 5.end\n 메뉴 번호>>";
		while(input!=5) {
			input=UserInput.inputInt(menuStr);//사용자에게 메뉴 선택값 받아오기	
			switch(input) {
			case 1://select
				System.out.println("전체 human 데이터>>");
				ArrayList<HumanDto> humanDtos= humanservice.select();
				for(HumanDto dto: humanDtos) {
					System.out.println(dto);
				}
				break;
			case 2://insert
				System.out.println("휴먼 데이터 입력하기");
				String name = UserInput.inputString("이름");
				int age = UserInput.inputInt("나이");
				double height = UserInput.inputDouble("키");
				LocalDateTime birthday = UserInput.inputLocalDateTime("생일");
//				humanservice.insert(new HumanDto("홍길나",52,151.,LocalDateTime.now()));		
				humanservice.insert(new HumanDto(name,age,height,birthday));	
				break;
			case 3://update
				System.out.println("업데이트 정보 입력하기(이름으로 나이 변경)>>");
				humanservice.update(UserInput.inputInt("나이:"),
						UserInput.inputString("이름: "));
				break;
			case 4://delete
				System.out.println("삭제 정보 입력하기(이름으로 삭제)");
				humanservice.delete(UserInput.inputString("이름:"));
				break;
			default:
				System.out.println("프로그램 종료");
			}
		}
		
//		//insert
//		dao.insert(new HumanDto("홍길나",52,151.,LocalDateTime.now()));
//		//update
//		dao.update(50,"홍길나");
//		//delete
//		dao.delete("홍길나");
//		//select
//		ArrayList<HumanDto> humanDtos = dao.select();
//		for(HumanDto dto:humanDtos) {
//			System.out.println(dto);
//		}
	}

}
