/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Rahul Bisht
 */
public class User implements Serializable 
{
    
    private String username;
    private String password;
    
    
    public User() //default cons
    {
    }
    
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() 
    {
        return username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    
}
