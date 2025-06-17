//PostService.java

package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.Post; // Post 엔티티 클래스 import
import com.back.domain.post.post.repository.PostRepository; // PostRepository 인터페이스 import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component // 이 클래스가 스프링 빈(객체)으로 등록되어 자동으로 관리되도록 설정
public class PostService {

    @Autowired // PostRepository를 자동으로 주입해줌(no new) (DI_Dependency Injection)
    private PostRepository postRepository;

    // 전체 게시글 개수를 반환하는 메서드
    public long count(){
        return postRepository.count();
    }

    // 게시글 저장 메서드: Post 객체를 받아 DB에 저장하고, 저장된 객체를 반환
    public Post save(Post post){
        return postRepository.save(post);
    }

    // 특정 ID에 해당하는 게시글을 Optional로 감싸서 반환하는 메서드
    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

}
