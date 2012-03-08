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
@Table(name = "USER_CAR", catalog = "", schema = "WEBADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserCar.findAll", query = "SELECT u FROM UserCar u"),
    @NamedQuery(name = "UserCar.findByCarNo", query = "SELECT u FROM UserCar u WHERE u.carNo = :carNo"),
    @NamedQuery(name = "UserCar.findByCarColor", query = "SELECT u FROM UserCar u WHERE u.carColor = :carColor"),
    @NamedQuery(name = "UserCar.findByCarModel", query = "SELECT u FROM UserCar u WHERE u.carModel = :carModel"),
    @NamedQuery(name = "UserCar.findByCarViolation", query = "SELECT u FROM UserCar u WHERE u.carViolation = :carViolation")})
public class UserCar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAR_NO", nullable = false, length = 20)
    private String carNo;
    @Column(name = "CAR_COLOR", length = 20)
    private String carColor;
    @Column(name = "CAR_MODEL", length = 255)
    private String carModel;
    @Column(name = "CAR_VIOLATION")
    private Short carViolation;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = false)
    @ManyToOne(optional = false)
    private Regusers userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carNo")
    private Collection<ParkLog> parkLogCollection;

    public UserCar() {
    }

    public UserCar(String carNo) {
        this.carNo = carNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Short getCarViolation() {
        return carViolation;
    }

    public void setCarViolation(Short carViolation) {
        this.carViolation = carViolation;
    }

    public Regusers getUserId() {
        return userId;
    }

    public void setUserId(Regusers userId) {
        this.userId = userId;
    }

    @XmlTransient
    public Collection<ParkLog> getParkLogCollection() {
        return parkLogCollection;
    }

    public void setParkLogCollection(Collection<ParkLog> parkLogCollection) {
        this.parkLogCollection = parkLogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carNo != null ? carNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserCar)) {
            return false;
        }
        UserCar other = (UserCar) object;
        if ((this.carNo == null && other.carNo != null) || (this.carNo != null && !this.carNo.equals(other.carNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.gradesign.smartpark.entity.UserCar[ carNo=" + carNo + " ]";
    }
    
}
