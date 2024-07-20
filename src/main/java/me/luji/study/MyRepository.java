package me.luji.study;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {

    <E extends T> E save(E entity);

    List<T> findAll();

    long count();

    @Nullable
    <E extends T> Optional <E> findById(Id id);
}
