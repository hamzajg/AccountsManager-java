package com.hamzajg.accountsmanager.domain;

public interface WriteRepository<T> {
    boolean store(int accountId, T obj);

    boolean update(int accountId, T obj);

    boolean delete(T obj);
}
