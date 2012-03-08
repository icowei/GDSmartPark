/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.session;

import edu.gradesign.smartpark.entity.Berth;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a
 */
@Stateless
public class BerthFacade extends AbstractFacade<Berth> {
    @PersistenceContext(unitName = "GDSmartParkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BerthFacade() {
        super(Berth.class);
    }
    
}
