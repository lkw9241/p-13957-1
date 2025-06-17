package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

}

//BackApplication 클래스는 Spring Boot 애플리케이션의 시작점 역할을 하는 매우 중요한 클래스입니다.
//
//		쉽게 비유하자면, 이 클래스는 여러분이 만든 **Spring Boot 애플리케이션이라는 건물을 건설하고 문을 여는 '총괄 관리자'**와 같습니다.