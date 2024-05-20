package com.the.en;

public enum LoginUserState {
	LOGOUT,      //로그아웃
	USER_LOGIN,  //유저로그인
	ADMIN_LOGIN, //관리자로그인
	EXIT         //프로그램 종료
}
//해당 프로그램은 반드시 4개중 하나의 상태을 가진다.