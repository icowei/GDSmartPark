package edu.gradesign.smartpark.entity;

import edu.gradesign.smartpark.entity.ParkLog;
import edu.gradesign.smartpark.entity.Regusers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-03-08T16:44:07")
@StaticMetamodel(UserCar.class)
public class UserCar_ { 

    public static volatile CollectionAttribute<UserCar, ParkLog> parkLogCollection;
    public static volatile SingularAttribute<UserCar, String> carNo;
    public static volatile SingularAttribute<UserCar, String> carModel;
    public static volatile SingularAttribute<UserCar, Regusers> userId;
    public static volatile SingularAttribute<UserCar, String> carColor;
    public static volatile SingularAttribute<UserCar, Short> carViolation;

}