package com.skplanet.plalab.h2hyun37;

public class exam01 {

	public static void main(String[] args) {

		/*
		 * Exercise : 이름, 전화번호, 신발사이즈에 대한 변수 선언 및 콘솔 출력 comment test comment
		 * test2
		 * 
		 * 이클립스 설정을 뭔가 해놔서 그런가..주석이 자꾸 한줄로 붙어버림... 줄바꿈 1번한 라인
		 * 
		 * 줄바꿈 2번한 라인
		 * 
		 * 추가로 한글 맨 뒷글자를 지워버리는 버그가 있다
		 */
		String name = "국현호";

		/*
		 * 한국 지역번호(?) 82를 붙여서 시도하면 길이가 int 범위를 벗어난다고 함
		 * 
		 * (The literal 821035743506 of type int is out of range)
		 * 
		 * -> Long wrapper class로 해결
		 */
		long phoneNumber = 821035743506L;
		// int phoneNumber = 1035743506;
		int shoeSize = 260;

		System.out.println("name = " + name);
		System.out.println("phoneNumber = " + phoneNumber);
		System.out.println("shoes Size = " + shoeSize);

	}
}
