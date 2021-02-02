/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.company.pruebatecnica.service;

import co.com.company.pruebatecnica.dao.IEmployeeDao;
import co.com.company.pruebatecnica.dto.Employee;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author munozbryg
 */
@Stateless
@WebService
public class EmployeeService implements IEmployeeService {

    @Inject
    private IEmployeeDao employeeDao;

    @WebMethod
    @Override
    public List<Employee> listEmployee() {
        return employeeDao.findAll();
    }

    @WebMethod
    @Override
    public Employee findEmployeeById(@WebParam(name = "idEmployee") Integer idEmployee) {
        Employee employee = new Employee();
        employee.setIdEmployee(idEmployee);
        return employeeDao.findById(employee);
    }

    @WebMethod
    @Override
    public Employee findEmployeeByDocument(@WebParam(name = "request") Employee employee) {
        return employeeDao.findByDocument(employee);
    }

    @WebMethod
    @Override
    public void createEmployee(@WebParam(name = "request") Employee employee) {
        employeeDao.insert(employee);
    }

    @WebMethod
    @Override
    public void updateEmployee(@WebParam(name = "request") Employee employee) {
        employeeDao.update(employee);
    }

    @WebMethod
    @Override
    public void deleteEmployee(@WebParam(name = "request") Employee employee) {
        employeeDao.dalete(employee);
    }
}
