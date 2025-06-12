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

            if(postRepository.count() >0) return;

            Post post1 = new Post();
            post1.setTitle("제목 1");

            postRepository.save(post1);

            Post post2 = new Post();
            post2.setTitle("제목 1");

            postRepository.save(post2);
            //INSERT INTO post2 set title = '제목 1';
            //id는 auto_increment이므로 자동으로 증가한다.

            System.out.println("기본 데이터 초기화 작업을 수행합니다.");
        };

    }


}
