package com.yonsai.project.service;

import java.util.HashMap;

class Student {
    String studentId;
    String name;
    int score;
    
    @Override
    public String toString() {
    	return "이름: " + name + "\n점수: " + score;
    }
}

class Book {
    String isbn;
    String title;
    String author;
    int stock;
    
    @Override
    public String toString() {
    	return "제목: " + title + "\n재고: " + stock;
    }
}

public class AmTest {

	public void 오전실습1() {
		
		HashMap<String, Student> 학생들 = new HashMap<>();
		
		Student 첫번째학생 = new Student();
		
		첫번째학생.studentId = "s001";
		첫번째학생.name = "김민지";
		첫번째학생.score = 95;
		
		학생들.put(첫번째학생.studentId, 첫번째학생);
		
		Student 두번째학생 = new Student();
		
		두번째학생.studentId = "s002";
		두번째학생.name = "이도현";
		두번째학생.score = 88;
		
		학생들.put(두번째학생.studentId, 두번째학생);
		
		System.out.println(학생들.get("s001"));
		System.out.println(학생들.get("s002"));
		
	}
	
	public void 오전실습2() {
		HashMap<String, Book> 도서목록 = new HashMap<>();
		
		Book 첫번째책 = new Book();
		
		첫번째책.isbn = "b001";
		첫번째책.title = "자바의 정석";
		첫번째책.author = "남궁성";
		첫번째책.stock = 10;
		
		도서목록.put(첫번째책.isbn, 첫번째책);
		
		Book 두번째책 = new Book();
		
		두번째책.isbn = "b002";
		두번째책.title = "이펙티브 자바";
		두번째책.author = "조슈아 블로크";
		두번째책.stock = 5;
		
		도서목록.put(두번째책.isbn, 두번째책);
		
		System.out.println(도서목록.get("b001"));
		 
		System.out.println(도서목록.get("b002"));
		
		
	}
	
}
