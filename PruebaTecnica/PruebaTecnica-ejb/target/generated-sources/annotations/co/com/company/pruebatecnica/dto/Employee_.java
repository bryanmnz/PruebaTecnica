package co.com.company.pruebatecnica.dto;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-01T20:18:06")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Integer> idEmployee;
    public static volatile SingularAttribute<Employee, Date> bithday;
    public static volatile SingularAttribute<Employee, String> documentType;
    public static volatile SingularAttribute<Employee, String> documentNumber;
    public static volatile SingularAttribute<Employee, String> function;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Date> vinculationDate;
    public static volatile SingularAttribute<Employee, Double> salary;
    public static volatile SingularAttribute<Employee, String> lastname;

}