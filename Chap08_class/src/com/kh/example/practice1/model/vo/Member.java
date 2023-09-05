package com.kh.example.practice1.model.vo;

public class Member {
	/*
	 * 1.멤버변수
	 * memberID : String
	 * memberPwd : String
	 * memberName : String
	 * age : int
	 * gender : char
	 * phone : String
	 * email : String
	 */
     String memberID;
     String memberPwd;
     String memberName;
     int age;
     char gender;
     String phone;
     String email;
     //2.생성자 + Member()
     public Member() {
         this.memberName = "서동재";
    	 this.memberPwd = memberPwd;
    	 this.memberID = memberID;
    	 this.age = age;
    	 this.gender = gender;
    	 this.phone = phone;
    	 this.email = email;
    	 
     }
     public void changeName() {
     System.out.println("이름 : " + memberName);
     }
     public void printName() {
    	 System.out.println();
     }
}
