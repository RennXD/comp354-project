package com.github.comp354project.service.sqlite;

import com.github.comp354project.service.exceptions.DatabaseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Singleton
public class ConnectionProvider implements IConnectionProvider{
    private static final Logger logger = LogManager.getLogger(ConnectionProvider.class);

    @Inject
    public ConnectionProvider(){
    }

    public Connection getConnection() throws DatabaseException{
        String dbName = "jdbc:sqlite:" + System.getenv("db");
        try {
            return DriverManager.getConnection(dbName);
        } catch(SQLException e){
            logger.error(e);
            throw new DatabaseException("Failed to get connection", e);
        }
    }
}
