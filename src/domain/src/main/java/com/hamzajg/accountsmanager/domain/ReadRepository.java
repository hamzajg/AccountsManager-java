package com.hamzajg.accountsmanager.domain;

import java.util.Collection;

public interface ReadRepository<T> {
    Collection<T> getAllByAccountId(int accountId);

    T getOneByAccountIdAndId(int accountId, int id);
}
