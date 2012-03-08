/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a
 */
@Entity
@Table(name = "PARK_LOG", catalog = "", schema = "WEBADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParkLog.findAll", query = "SELECT p FROM ParkLog p"),
    @NamedQuery(name = "ParkLog.findByPlogId", query = "SELECT p FROM ParkLog p WHERE p.plogId = :plogId"),
    @NamedQuery(name = "ParkLog.findByStartTime", query = "SELECT p FROM ParkLog p WHERE p.startTime = :startTime"),
    @NamedQuery(name = "ParkLog.findByEndTime", query = "SELECT p FROM ParkLog p WHERE p.endTime = :endTime"),
    @NamedQuery(name = "ParkLog.findByCost", query = "SELECT p FROM ParkLog p WHERE p.cost = :cost"),
    @NamedQuery(name = "ParkLog.findByParkflag", query = "SELECT p FROM ParkLog p WHERE p.parkflag = :parkflag"),
    @NamedQuery(name = "ParkLog.findByResflag", query = "SELECT p FROM ParkLog p WHERE p.resflag = :resflag"),
    @NamedQuery(name = "ParkLog.findByResState", query = "SELECT p FROM ParkLog p WHERE p.resState = :resState"),
    @NamedQuery(name = "ParkLog.findByResTime", query = "SELECT p FROM ParkLog p WHERE p.resTime = :resTime"),
    @NamedQuery(name = "ParkLog.findByViolation", query = "SELECT p FROM ParkLog p WHERE p.violation = :violation"),
    @NamedQuery(name = "ParkLog.findByDescViolation", query = "SELECT p FROM ParkLog p WHERE p.descViolation = :descViolation")})
public class ParkLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLOG_ID", nullable = false)
    private Integer plogId;
    @Basic(optional = false)
    @Column(name = "START_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @Column(name = "END_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Basic(optional = false)
    @Column(name = "COST", nullable = false)
    private double cost;
    @Basic(optional = false)
    @Column(name = "PARKFLAG", nullable = false)
    private short parkflag;
    @Basic(optional = false)
    @Column(name = "RESFLAG", nullable = false)
    private short resflag;
    @Column(name = "RES_STATE")
    private Short resState;
    @Column(name = "RES_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resTime;
    @Basic(optional = false)
    @Column(name = "VIOLATION", nullable = false)
    private short violation;
    @Column(name = "DESC_VIOLATION", length = 255)
    private String descViolation;
    @JoinColumn(name = "CAR_NO", referencedColumnName = "CAR_NO", nullable = false)
    @ManyToOne(optional = false)
    private UserCar carNo;
    @JoinColumn(name = "BERTH_ID", referencedColumnName = "BERTH_ID", nullable = false)
    @ManyToOne(optional = false)
    private Berth berthId;

    public ParkLog() {
    }

    public ParkLog(Integer plogId) {
        this.plogId = plogId;
    }

    public ParkLog(Integer plogId, Date startTime, Date endTime, double cost, short parkflag, short resflag, short violation) {
        this.plogId = plogId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cost = cost;
        this.parkflag = parkflag;
        this.resflag = resflag;
        this.violation = violation;
    }

    public Integer getPlogId() {
        return plogId;
    }

    public void setPlogId(Integer plogId) {
        this.plogId = plogId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public short getParkflag() {
        return parkflag;
    }

    public void setParkflag(short parkflag) {
        this.parkflag = parkflag;
    }

    public short getResflag() {
        return resflag;
    }

    public void setResflag(short resflag) {
        this.resflag = resflag;
    }

    public Short getResState() {
        return resState;
    }

    public void setResState(Short resState) {
        this.resState = resState;
    }

    public Date getResTime() {
        return resTime;
    }

    public void setResTime(Date resTime) {
        this.resTime = resTime;
    }

    public short getViolation() {
        return violation;
    }

    public void setViolation(short violation) {
        this.violation = violation;
    }

    public String getDescViolation() {
        return descViolation;
    }

    public void setDescViolation(String descViolation) {
        this.descViolation = descViolation;
    }

    public UserCar getCarNo() {
        return carNo;
    }

    public void setCarNo(UserCar carNo) {
        this.carNo = carNo;
    }

    public Berth getBerthId() {
        return berthId;
    }

    public void setBerthId(Berth berthId) {
        this.berthId = berthId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plogId != null ? plogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParkLog)) {
            return false;
        }
        ParkLog other = (ParkLog) object;
        if ((this.plogId == null && other.plogId != null) || (this.plogId != null && !this.plogId.equals(other.plogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.gradesign.smartpark.entity.ParkLog[ plogId=" + plogId + " ]";
    }
    
}
