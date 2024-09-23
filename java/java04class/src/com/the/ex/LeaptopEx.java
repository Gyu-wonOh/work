package com.the.ex;

import com.the.dto.*;

public class LeaptopEx {

	public static void main(String[] args) {

		Leaptop note = new Leaptop();
		System.out.println(String.format("제조사 : %s \nCPU 종류: %s\n화면크기: %d인치\n메모리: %dGB\n저장용량: %dGB\n운영체제: %s\n무게: %.1fkg"
				, note.maker, note.cpuType,note.screenSize,note.memory,note.storage,note.os,note.weightKg));
		System.out.println();
		Leaptop note2 = new Leaptop();
		note2.maker = "APPLE";
		note2.cpuType = "M1 7 CORE";
		note2.screenSize= 13;
		note2.memory = 8;
		note2.storage =256;
		note2.os = "macOS Big Sur";
		note2.weightKg = 1.29;
		System.out.println(String.format("제조사 : %s \nCPU 종류: %s\n화면크기: %d인치\n메모리: %dGB\n저장용량: %dGB\n운영체제: %s\n무게: %.1fkg"
				, note2.maker, note2.cpuType,note2.screenSize,note2.memory,note2.storage,note2.os,note2.weightKg));
	
	}

}
