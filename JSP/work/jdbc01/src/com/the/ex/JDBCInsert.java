package com.the.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDBCInsert {

	public static void main(String[] args) {
		try {
			//1.드라이버 로딩
			//class forName==new 클래스() 문자열로 클래스 생성하는 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결");
			//2.데이터베이스 연결 Connect클래스
			//jdbc:oracle:thin:(제품명)@Localhost(주소):1521(포트):xe(씨드아이디)
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##human";
			String pw = "human";
			Connection conn = DriverManager.getConnection(url,user,pw);
			System.out.println("데이터베이스에 접속 성공");
			//SQL 실행을 위한 statement 객체 생성
			Statement st = conn.createStatement();
			//INSERT할 데이터 설정
			String name ="홍길도";
			int age = 15;
			double height =166;
			LocalDateTime birthday = LocalDateTime.now();
			//SQL문 작성 - 값 대신 변수를 사용하여 SQL문을 더욱 유연하게 작성
			String sql = String.format("insert into human values('"+"%s',%d,%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
					name,age,height,birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			System.out.println("sql 에러시 여기서 문자열 확인:"+sql);
			//sql문 실행 및 결과처리
			int cnt = st.executeUpdate(sql); //executeUpdate 메서드는 변경된 데이터 개수가 리턴된다.
			System.out.println(cnt+"개 데이터가 입력되었습니다.");
			//6.데이터베이스와 연결된 자원을 반납
			if(st!=null)st.close();
			if(conn!=null)conn.close();
			System.out.println("정상종료");
		}
		catch(	ClassNotFoundException e){
		
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		catch(SQLException e){
			e.printStackTrace();
	
		}
	}
}
