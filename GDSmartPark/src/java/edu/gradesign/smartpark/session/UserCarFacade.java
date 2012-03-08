/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.session;

import edu.gradesign.smartpark.entity.UserCar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a
 */
@Stateless
public class UserCarFacade extends AbstractFacade<UserCar> {
    @PersistenceContext(unitName = "GDSmartParkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserCarFacade() {
        super(UserCar.class);
    }
    
}
