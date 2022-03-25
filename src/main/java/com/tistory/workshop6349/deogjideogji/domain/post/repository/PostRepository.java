package com.tistory.workshop6349.deogjideogji.domain.post.repository;

import com.tistory.workshop6349.deogjideogji.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
