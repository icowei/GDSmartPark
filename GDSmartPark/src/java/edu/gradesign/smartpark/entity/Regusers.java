/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author a
 */
@Entity
@Table(name = "REGUSERS", catalog = "", schema = "WEBADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regusers.findAll", query = "SELECT r FROM Regusers r"),
    @NamedQuery(name = "Regusers.findByUserId", query = "SELECT r FROM Regusers r WHERE r.userId = :userId"),
    @NamedQuery(name = "Regusers.findByUserPhone", query = "SELECT r FROM Regusers r WHERE r.userPhone = :userPhone"),
    @NamedQuery(name = "Regusers.findByUserPwd", query = "SELECT r FROM Regusers r WHERE r.userPwd = :userPwd"),
    @NamedQuery(name = "Regusers.findByUserPermission", query = "SELECT r FROM Regusers r WHERE r.userPermission = :userPermission"),
    @NamedQuery(name = "Regusers.findByUserAccount", query = "SELECT r FROM Regusers r WHERE r.userAccount = :userAccount")})
public class Regusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "USER_PHONE", nullable = false, length = 20)
    private String userPhone;
    @Basic(optional = false)
    @Column(name = "USER_PWD", nullable = false, length = 20)
    private String userPwd;
    @Basic(optional = false)
    @Column(name = "USER_PERMISSION", nullable = false)
    private short userPermission;
    @Basic(optional = false)
    @Column(name = "USER_ACCOUNT", nullable = false)
    private double userAccount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<UserCar> userCarCollection;

    public Regusers() {
    }

    public Regusers(Integer userId) {
        this.userId = userId;
    }

    public Regusers(Integer userId, String userPhone, String userPwd, short userPermission, double userAccount) {
        this.userId = userId;
        this.userPhone = userPhone;
        this.userPwd = userPwd;
        this.userPermission = userPermission;
        this.userAccount = userAccount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public short getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(short userPermission) {
        this.userPermission = userPermission;
    }

    public double getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(double userAccount) {
        this.userAccount = userAccount;
    }

    @XmlTransient
    public Collection<UserCar> getUserCarCollection() {
        return userCarCollection;
    }

    public void setUserCarCollection(Collection<UserCar> userCarCollection) {
        this.userCarCollection = userCarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regusers)) {
            return false;
        }
        Regusers other = (Regusers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.gradesign.smartpark.entity.Regusers[ userId=" + userId + " ]";
    }
    
}
