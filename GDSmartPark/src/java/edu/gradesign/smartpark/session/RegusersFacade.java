/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gradesign.smartpark.session;

import edu.gradesign.smartpark.entity.Regusers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a
 */
@Stateless
public class RegusersFacade extends AbstractFacade<Regusers> {
    @PersistenceContext(unitName = "GDSmartParkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegusersFacade() {
        super(Regusers.class);
    }
    
}
