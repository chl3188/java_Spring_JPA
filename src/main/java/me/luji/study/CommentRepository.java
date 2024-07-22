package me.luji.study;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String comment, int likeCount);

    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String comment);
//
//    Page<Comment> findByCommentContainsIgnoreCase(String comment, Pageable page);
//
//    Stream<Comment> findByCommentContainsIgnoreCase(String comment, Pageable page);

    @Async
    Future<List<Comment>> findByCommentContainsIgnoreCase(String comment, Pageable page);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCnt, Post post, Pageable page);
}