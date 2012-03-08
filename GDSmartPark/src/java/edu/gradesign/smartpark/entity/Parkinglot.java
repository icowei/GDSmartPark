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
@Table(name = "PARKINGLOT", catalog = "", schema = "WEBADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parkinglot.findAll", query = "SELECT p FROM Parkinglot p"),
    @NamedQuery(name = "Parkinglot.findByPlId", query = "SELECT p FROM Parkinglot p WHERE p.plId = :plId"),
    @NamedQuery(name = "Parkinglot.findByPlAddrCity", query = "SELECT p FROM Parkinglot p WHERE p.plAddrCity = :plAddrCity"),
    @NamedQuery(name = "Parkinglot.findByPlAddrStreet", query = "SELECT p FROM Parkinglot p WHERE p.plAddrStreet = :plAddrStreet"),
    @NamedQuery(name = "Parkinglot.findByPlAddrArea", query = "SELECT p FROM Parkinglot p WHERE p.plAddrArea = :plAddrArea"),
    @NamedQuery(name = "Parkinglot.findByPlAddrNo", query = "SELECT p FROM Parkinglot p WHERE p.plAddrNo = :plAddrNo"),
    @NamedQuery(name = "Parkinglot.findByPlBerthnum", query = "SELECT p FROM Parkinglot p WHERE p.plBerthnum = :plBerthnum"),
    @NamedQuery(name = "Parkinglot.findByPlBerthrate", query = "SELECT p FROM Parkinglot p WHERE p.plBerthrate = :plBerthrate"),
    @NamedQuery(name = "Parkinglot.findByPlLongitude", query = "SELECT p FROM Parkinglot p WHERE p.plLongitude = :plLongitude"),
    @NamedQuery(name = "Parkinglot.findByPlLatitude", query = "SELECT p FROM Parkinglot p WHERE p.plLatitude = :plLatitude")})
public class Parkinglot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PL_ID", nullable = false)
    private Integer plId;
    @Basic(optional = false)
    @Column(name = "PL_ADDR_CITY", nullable = false, length = 255)
    private String plAddrCity;
    @Basic(optional = false)
    @Column(name = "PL_ADDR_STREET", nullable = false, length = 255)
    private String plAddrStreet;
    @Column(name = "PL_ADDR_AREA", length = 255)
    private String plAddrArea;
    @Basic(optional = false)
    @Column(name = "PL_ADDR_NO", nullable = false)
    private int plAddrNo;
    @Basic(optional = false)
    @Column(name = "PL_BERTHNUM", nullable = false)
    private int plBerthnum;
    @Basic(optional = false)
    @Column(name = "PL_BERTHRATE", nullable = false)
    private double plBerthrate;
    @Basic(optional = false)
    @Column(name = "PL_LONGITUDE", nullable = false)
    private double plLongitude;
    @Basic(optional = false)
    @Column(name = "PL_LATITUDE", nullable = false)
    private double plLatitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plId")
    private Collection<Berth> berthCollection;

    public Parkinglot() {
    }

    public Parkinglot(Integer plId) {
        this.plId = plId;
    }

    public Parkinglot(Integer plId, String plAddrCity, String plAddrStreet, int plAddrNo, int plBerthnum, double plBerthrate, double plLongitude, double plLatitude) {
        this.plId = plId;
        this.plAddrCity = plAddrCity;
        this.plAddrStreet = plAddrStreet;
        this.plAddrNo = plAddrNo;
        this.plBerthnum = plBerthnum;
        this.plBerthrate = plBerthrate;
        this.plLongitude = plLongitude;
        this.plLatitude = plLatitude;
    }

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    public String getPlAddrCity() {
        return plAddrCity;
    }

    public void setPlAddrCity(String plAddrCity) {
        this.plAddrCity = plAddrCity;
    }

    public String getPlAddrStreet() {
        return plAddrStreet;
    }

    public void setPlAddrStreet(String plAddrStreet) {
        this.plAddrStreet = plAddrStreet;
    }

    public String getPlAddrArea() {
        return plAddrArea;
    }

    public void setPlAddrArea(String plAddrArea) {
        this.plAddrArea = plAddrArea;
    }

    public int getPlAddrNo() {
        return plAddrNo;
    }

    public void setPlAddrNo(int plAddrNo) {
        this.plAddrNo = plAddrNo;
    }

    public int getPlBerthnum() {
        return plBerthnum;
    }

    public void setPlBerthnum(int plBerthnum) {
        this.plBerthnum = plBerthnum;
    }

    public double getPlBerthrate() {
        return plBerthrate;
    }

    public void setPlBerthrate(double plBerthrate) {
        this.plBerthrate = plBerthrate;
    }

    public double getPlLongitude() {
        return plLongitude;
    }

    public void setPlLongitude(double plLongitude) {
        this.plLongitude = plLongitude;
    }

    public double getPlLatitude() {
        return plLatitude;
    }

    public void setPlLatitude(double plLatitude) {
        this.plLatitude = plLatitude;
    }

    @XmlTransient
    public Collection<Berth> getBerthCollection() {
        return berthCollection;
    }

    public void setBerthCollection(Collection<Berth> berthCollection) {
        this.berthCollection = berthCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plId != null ? plId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parkinglot)) {
            return false;
        }
        Parkinglot other = (Parkinglot) object;
        if ((this.plId == null && other.plId != null) || (this.plId != null && !this.plId.equals(other.plId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.gradesign.smartpark.entity.Parkinglot[ plId=" + plId + " ]";
    }
    
}
