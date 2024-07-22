package me.luji.study;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String comment, int likeCount);

    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String comment);
//
//    Page<Comment> findByCommentContainsIgnoreCase(String comment, Pageable page);

    Stream<Comment> findByCommentContainsIgnoreCase(String comment, Pageable page);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCnt, Post post, Pageable page);
}