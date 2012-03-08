/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.session;

import edu.gradesign.smartpark.entity.ParkLog;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a
 */
@Stateless
public class ParkLogFacade extends AbstractFacade<ParkLog> {
    @PersistenceContext(unitName = "GDSmartParkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParkLogFacade() {
        super(ParkLog.class);
    }
    
}
