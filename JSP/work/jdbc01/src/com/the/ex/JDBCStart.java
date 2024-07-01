package com.the.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class JDBCStart {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// 1.사용할 DB 선택
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2, DB연결정보 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "c##human";
			String pw = "human";
			conn = DriverManager.getConnection(url, id, pw);
			// 3. 연결객체 Statement 생성
			st = conn.createStatement();

			// 4. 요청한 sql문자열 생성
			String sql = "select* from human";

			// 5. Statement객체를 통해서 sql전달
			// 리턴값이 테이블이면 executeQuery
			// 리턴값이 있으면 executeUpdate
			rs = st.executeQuery(sql);

			// 6.rs를 이용해서 가져온 데이터 테이블 확인
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				LocalDateTime birthday = rs.getTimestamp("birthday").toLocalDateTime();

				System.out.println("이름:" + name + "나이" + age + "키: " + height + "생일: " + birthday);
			}
			if (rs != null)
				rs.close();
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
