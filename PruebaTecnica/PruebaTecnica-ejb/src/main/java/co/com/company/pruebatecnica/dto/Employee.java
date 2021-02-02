/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.company.pruebatecnica.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author munozbryg
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Employee.findAll", query = "SELECT e FROM Employee e ORDER BY e.idEmployee")
})
@Table(name = "employee")
public class Employee implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    public Integer idEmployee;

    @Column(name = "name")
    public String name;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "documenttype")
    public String documentType;

    @Column(name = "document")
    public String documentNumber;

    @Column(name = "birthday")
    public Date bithday;

    @Column(name = "vinculation_date")
    public Date vinculationDate;

    @Column(name = "function")
    public String function;
    
    @Column(name = "salary")
    public double salary;

    public Employee() {
    }

    public Employee(String name, String lastname, String documentType, String documentNumber, Date bithday, Date vinculationDate, String function, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.bithday = bithday;
        this.vinculationDate = vinculationDate;
        this.function = function;
        this.salary = salary;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    public Date getVinculationDate() {
        return vinculationDate;
    }

    public void setVinculationDate(Date vinculationDate) {
        this.vinculationDate = vinculationDate;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
