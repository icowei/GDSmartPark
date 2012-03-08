/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author a
 */
@Stateless
@LocalBean
public class PasswordBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private String password;  

    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }
    
}
