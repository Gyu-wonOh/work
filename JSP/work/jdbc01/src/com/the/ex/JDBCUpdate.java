package com.the.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) {
		String url=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##human";
			String pw ="human";
			Connection conn = DriverManager.getConnection(url,user,pw);
			//java.sql로 import해야한다.
			Statement st =conn.createStatement();
			String name="홍길도";
			int age = 39;
			String sql = String.format("update human set age= %d where name='%s'", age,name);
			System.out.println("sql 에러시 여기서 문자열을 확인"+sql);
			//executeUpdate는 변경된 데이터 개수가 리턴된다.
			int cnt =st.executeUpdate(sql);
			System.out.println(cnt +"개 데이터가 변경되었습니다.");
			if(st != null)st.close();
			if(conn != null)conn.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
