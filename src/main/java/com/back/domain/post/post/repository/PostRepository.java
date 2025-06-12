package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
    // JpaRepository를 상속받으면 기본적인 CRUD 메서드가 제공된다.
    // 추가적인 메서드를 정의할 수 있다.

}
//구현을 하면서 숙지해보자(외워보자)