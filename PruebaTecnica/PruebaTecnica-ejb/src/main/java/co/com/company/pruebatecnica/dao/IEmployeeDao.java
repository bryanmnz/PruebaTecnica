/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.company.pruebatecnica.dao;

import co.com.company.pruebatecnica.dto.Employee;
import java.util.List;

/**
 *
 * @author munozbryg
 */
public interface IEmployeeDao {

    public List<Employee> findAll();

    public Employee findById(Employee employee);
    
    public Employee findByDocument(Employee employee);
    
    public void insert(Employee employee);
    
    public void update(Employee employee);
    
    public void dalete(Employee employee);
}
