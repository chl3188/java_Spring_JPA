package me.luji.study;

import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

    Comment save(Comment comment);

    List<Comment> findAll();
}


//@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
//public interface CommentRepository {
//
//    Comment save(Comment comment);
//
//    List<Comment> findAll();
//}
