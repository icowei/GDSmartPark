package edu.gradesign.smartpark.entity;

import edu.gradesign.smartpark.entity.ParkLog;
import edu.gradesign.smartpark.entity.Parkinglot;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-03-08T16:44:07")
@StaticMetamodel(Berth.class)
public class Berth_ { 

    public static volatile SingularAttribute<Berth, Integer> berthId;
    public static volatile CollectionAttribute<Berth, ParkLog> parkLogCollection;
    public static volatile SingularAttribute<Berth, Short> parkFlag;
    public static volatile SingularAttribute<Berth, Short> resFlag;
    public static volatile SingularAttribute<Berth, Parkinglot> plId;

}