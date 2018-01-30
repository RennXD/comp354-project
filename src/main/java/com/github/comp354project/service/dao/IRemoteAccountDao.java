package com.github.comp354project.service.dao;

import com.github.comp354project.service.exceptions.DatabaseException;
import com.github.comp354project.service.account.remote.RemoteAccount;
import com.github.comp354project.service.exceptions.InvalidParameterException;

public interface IRemoteAccountDao {
    RemoteAccount getRemoteAccount(Integer ID) throws DatabaseException;
}
