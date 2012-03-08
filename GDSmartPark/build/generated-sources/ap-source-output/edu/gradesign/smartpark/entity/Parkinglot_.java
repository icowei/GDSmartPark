package edu.gradesign.smartpark.entity;

import edu.gradesign.smartpark.entity.Berth;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-03-08T16:44:07")
@StaticMetamodel(Parkinglot.class)
public class Parkinglot_ { 

    public static volatile SingularAttribute<Parkinglot, Double> plBerthrate;
    public static volatile SingularAttribute<Parkinglot, Integer> plBerthnum;
    public static volatile SingularAttribute<Parkinglot, String> plAddrCity;
    public static volatile CollectionAttribute<Parkinglot, Berth> berthCollection;
    public static volatile SingularAttribute<Parkinglot, Integer> plAddrNo;
    public static volatile SingularAttribute<Parkinglot, Double> plLongitude;
    public static volatile SingularAttribute<Parkinglot, String> plAddrArea;
    public static volatile SingularAttribute<Parkinglot, Integer> plId;
    public static volatile SingularAttribute<Parkinglot, Double> plLatitude;
    public static volatile SingularAttribute<Parkinglot, String> plAddrStreet;

}