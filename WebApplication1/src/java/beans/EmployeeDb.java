/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miyazaki
 */
@Stateless
public class EmployeeDb {
    @PersistenceContext
    private EntityManager em;
    public void create(Employee employee){
        em.persist(employee);
    }
}
