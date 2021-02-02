/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.company.pruebatecnica.dao;

import co.com.company.pruebatecnica.dto.Employee;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author munozbryg
 */
@Stateless
public class EmployeeDaoImpl implements IEmployeeDao {

    @PersistenceContext(unitName = "EmployeesPU")
    EntityManager em;

    @Override
    public List<Employee> findAll() {
        return em.createNamedQuery("Employee.findAll").getResultList();
    }

    @Override
    public Employee findById(Employee employee) {
        return em.find(Employee.class, employee.getIdEmployee());
    }

    @Override
    public Employee findByDocument(Employee employee) {
        Query query = em.createQuery("FROM Employee e WHERE e.document =:document");
        query.setParameter("document", employee.getDocumentNumber());
        return (Employee) query.getSingleResult();
    }

    @Override
    public void insert(Employee employee) {
        em.persist(employee);
    }

    @Override
    public void update(Employee employee) {
        em.merge(employee);
    }

    @Override
    public void dalete(Employee employee) {
        em.remove(em.merge(employee));
    }
}
