package me.luji.study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Account account = new Account();
//        account.setUsername("chlee2");
//        account.setPassword("wnfjdwnfjd");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");
//
//        account.addStudy(study);
//
//        Session session = entityManager.unwrap(Session.class);
//        session.save(account);
//        session.save(study);

//        Account chlee = session.load(Account.class, account.getId());
//        chlee.setUsername("chlchle");
//        chlee.setUsername("chlchle2");
//        chlee.setUsername("chlee");
//        System.out.println("==================");
//        System.out.println(chlee.getUsername());

//        Post post = new Post();
//        post.setTitle("Spring Data Jpa 언제 해?");
//
//        Comment comment = new Comment();
//        comment.setComment("빨리 해보고 싶음");
//        post.addComment(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("빨리 해보고 싶음2");
//        post.addComment(comment1);

        Session session = entityManager.unwrap(Session.class);
//        session.save(post);
//        Post post = session.get(Post.class, 1);
//        System.out.println(post.getTitle());
//        Comment comment = session.get(Comment.class, 1);
//        System.out.println(comment.getComment());
//        System.out.println(comment.getPost().getTitle());
//
//        post.getComments().forEach(c -> {
//            System.out.println("===><===");
//            System.out.println(c.getComment());
//        });

        //JPQL
//        TypedQuery<Post> query = entityManager.createQuery("SELECT p From Post as p", Post.class);
//        List<Post> post = query.getResultList();
//        post.forEach(System.out::println);

        //Criteria
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);

        // Native-Query
        List<Post> posts = entityManager.createNativeQuery("Select * from Post", Post.class)
                .getResultList();
        posts.forEach(System.out::println);

    }
}
