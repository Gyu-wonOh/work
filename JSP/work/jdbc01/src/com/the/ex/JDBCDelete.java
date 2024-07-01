package com.the.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class JDBCDelete {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			// 1.사용할 DB 선택
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2, DB연결정보 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "c##human";
			String pw = "human";
			conn = DriverManager.getConnection(url, id, pw);
			// java.sql로 import해야한다.
			// 3. 연결객체 Statement 생성
			st = conn.createStatement();
			String name = "홍길도";
			String sql = String.format("delete human where name='%s'", name);
			// executUpdate는 변경된 데이터 개수가 리턴된다.
			System.out.println("sql 에러시 여기서 문자열을 확인:" + sql);
			int cnt = st.executeUpdate(sql);
			System.out.println(cnt + "개 데이터가 삭제 되었습니다.");

			if (st != null)
				st.close();
			if (conn != null)
				conn.close();

			System.out.println("정상종료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
