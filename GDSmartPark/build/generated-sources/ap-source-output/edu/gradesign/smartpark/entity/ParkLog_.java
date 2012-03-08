package edu.gradesign.smartpark.entity;

import edu.gradesign.smartpark.entity.Berth;
import edu.gradesign.smartpark.entity.UserCar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-03-08T16:44:07")
@StaticMetamodel(ParkLog.class)
public class ParkLog_ { 

    public static volatile SingularAttribute<ParkLog, Date> startTime;
    public static volatile SingularAttribute<ParkLog, Berth> berthId;
    public static volatile SingularAttribute<ParkLog, UserCar> carNo;
    public static volatile SingularAttribute<ParkLog, Integer> plogId;
    public static volatile SingularAttribute<ParkLog, Date> resTime;
    public static volatile SingularAttribute<ParkLog, Short> resState;
    public static volatile SingularAttribute<ParkLog, Short> parkflag;
    public static volatile SingularAttribute<ParkLog, Short> violation;
    public static volatile SingularAttribute<ParkLog, Date> endTime;
    public static volatile SingularAttribute<ParkLog, Short> resflag;
    public static volatile SingularAttribute<ParkLog, Double> cost;
    public static volatile SingularAttribute<ParkLog, String> descViolation;

}