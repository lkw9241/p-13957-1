package com.back.global.initData;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {
    @Bean
    ApplicationRunner BaseInitDataApplicationRunner(){
        return args ->{
            System.out.println("기본 데이터 초기화 작업을 수행합니다.");

        }

    }


}
