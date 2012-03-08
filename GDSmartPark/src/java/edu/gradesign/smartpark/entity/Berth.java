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
@Table(name = "BERTH", catalog = "", schema = "WEBADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Berth.findAll", query = "SELECT b FROM Berth b"),
    @NamedQuery(name = "Berth.findByBerthId", query = "SELECT b FROM Berth b WHERE b.berthId = :berthId"),
    @NamedQuery(name = "Berth.findByResFlag", query = "SELECT b FROM Berth b WHERE b.resFlag = :resFlag"),
    @NamedQuery(name = "Berth.findByParkFlag", query = "SELECT b FROM Berth b WHERE b.parkFlag = :parkFlag")})
public class Berth implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BERTH_ID", nullable = false)
    private Integer berthId;
    @Basic(optional = false)
    @Column(name = "RES_FLAG", nullable = false)
    private short resFlag;
    @Basic(optional = false)
    @Column(name = "PARK_FLAG", nullable = false)
    private short parkFlag;
    @JoinColumn(name = "PL_ID", referencedColumnName = "PL_ID", nullable = false)
    @ManyToOne(optional = false)
    private Parkinglot plId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "berthId")
    private Collection<ParkLog> parkLogCollection;

    public Berth() {
    }

    public Berth(Integer berthId) {
        this.berthId = berthId;
    }

    public Berth(Integer berthId, short resFlag, short parkFlag) {
        this.berthId = berthId;
        this.resFlag = resFlag;
        this.parkFlag = parkFlag;
    }

    public Integer getBerthId() {
        return berthId;
    }

    public void setBerthId(Integer berthId) {
        this.berthId = berthId;
    }

    public short getResFlag() {
        return resFlag;
    }

    public void setResFlag(short resFlag) {
        this.resFlag = resFlag;
    }

    public short getParkFlag() {
        return parkFlag;
    }

    public void setParkFlag(short parkFlag) {
        this.parkFlag = parkFlag;
    }

    public Parkinglot getPlId() {
        return plId;
    }

    public void setPlId(Parkinglot plId) {
        this.plId = plId;
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
        hash += (berthId != null ? berthId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Berth)) {
            return false;
        }
        Berth other = (Berth) object;
        if ((this.berthId == null && other.berthId != null) || (this.berthId != null && !this.berthId.equals(other.berthId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.gradesign.smartpark.entity.Berth[ berthId=" + berthId + " ]";
    }
    
}
