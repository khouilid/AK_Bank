package com.example.DAO;

import com.example.JavaBeans.Companyes;
import com.example.JavaBeans.Users;

import java.sql.SQLException;

public interface CompanyDAO {



    boolean create(Companyes user) throws SQLException;

    Users<Companyes> getAll() throws SQLException;

    Companyes getById(int user_id) throws SQLException;

    void update(Companyes user);

    void delete(long user_id) throws SQLException;





}
