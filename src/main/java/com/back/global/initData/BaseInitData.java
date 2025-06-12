package com.back.global.initData;

import com.back.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {

    @Autowired
    private PostRepository postRepository;

    @Bean
    ApplicationRunner BaseInitDataApplicationRunner(){
        return args ->{
            System.out.println("기본 데이터 초기화 작업을 수행합니다.");

            postRepository.count();


        };

    }


}
