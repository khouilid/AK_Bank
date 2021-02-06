package com.example.DAO;

import com.example.JavaBeans.Companyes;
import com.example.JavaBeans.Users;

public interface CompanyDAO {



    void create(Companyes user);

    Users<Companyes> getAll();

    Users<Companyes> getById();

    void update(Companyes user);

    void delete(long user_id);





}
