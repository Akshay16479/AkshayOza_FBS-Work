package com.dao;

import com.beans.User;

public interface DAOInterface 
{
    public void insertUser(User u);
    public boolean retriveData(String username);
}