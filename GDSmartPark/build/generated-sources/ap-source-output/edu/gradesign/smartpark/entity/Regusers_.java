package edu.gradesign.smartpark.entity;

import edu.gradesign.smartpark.entity.UserCar;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-03-08T16:44:07")
@StaticMetamodel(Regusers.class)
public class Regusers_ { 

    public static volatile CollectionAttribute<Regusers, UserCar> userCarCollection;
    public static volatile SingularAttribute<Regusers, Integer> userId;
    public static volatile SingularAttribute<Regusers, String> userPwd;
    public static volatile SingularAttribute<Regusers, Short> userPermission;
    public static volatile SingularAttribute<Regusers, String> userPhone;
    public static volatile SingularAttribute<Regusers, Double> userAccount;

}