/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.company.pruebatecnica.service;

import co.com.company.pruebatecnica.dto.Employee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author munozbryg
 */
@Local
public interface IEmployeeService {

    public List<Employee> listEmployee();

    public Employee findEmployeeById(Integer idEmployee);

    public Employee findEmployeeByDocument(Employee employee);

    public void createEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(Employee employee);
}
