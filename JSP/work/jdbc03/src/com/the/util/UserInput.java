package com.the.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

		private static Scanner sc = new Scanner(System.in);

		public static int inputInt(String st) {
			System.out.println(st + " 정수를 입력하세요.>>");
			return Integer.parseInt(sc.nextLine());
		}

		public static double inputDouble(String st) {
			System.out.println(st + " 실수를 입력하세요.>>");
			return Double.parseDouble(sc.nextLine());
		}

		public static String inputString(String st) {
			System.out.println(st + " 문자열을 입력하세요.>>");
			return sc.nextLine();
		}

		public static LocalDateTime inputLocalDateTime(String str) {
			System.out.println(str + " 생일을 입력하세요.(yyyy-MM-dd HH:mm:ss)>>");
			
			String defaultValue=sc.nextLine();
			if(defaultValue.equals("")) {
				defaultValue="2000-01-01 01:01:01";
			}
			return LocalDateTime.parse(defaultValue, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		}

		public static String dateToString(LocalDateTime date) {
			return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		}
}
