package com.back.global.initData;

import com.back.domain.post.post.entity.Post;
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

            Post post = new Post();
            post.setTitle("제목 1");

            postRepository.save(post);
            //INSERT INTO post set title = '제목 1';
            //id는 auto_increment이므로 자동으로 증가한다.

        };

    }


}
