package com.toby.spring.book.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao{
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // N사 DB connection 코드
        return null;
    }
}
