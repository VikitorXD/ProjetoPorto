package org.example.Repositories;

public interface IRepository <T> {

    void save(T object) throws Exception;
    void update(T object) throws Exception;
    void delete(Long id) throws Exception;

}
