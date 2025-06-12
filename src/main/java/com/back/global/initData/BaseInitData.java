package com.back.global.initData;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class BaseInitData {

    @Autowired
    private PostService postService;

    @Bean
    ApplicationRunner BaseInitDataApplicationRunner(){
        return args ->{

            work1();//생성의 역할
            work2();//조회의 역할
        };

    }
    void work1(){
    if(postService.count() >0) return;

    Post post1 = postService.save(new Post("제목 1","내용 1"));
    Post post2 = postService.save(new Post("제목 1","내용 2"));

            System.out.println(post1.getId());
            System.out.println(post2.getId());
            System.out.println("기본 데이터 초기화 작업을 수행합니다.");
    }
    void work2(){
        Optional<Post> opPost1 = postService.findById(1);


        Post post1 = opPost1.get();

        System.out.println("post1 : "+post1);
    }
}
