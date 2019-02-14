package com.learning.spring.spring_aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.spring_aop.model.Employee;
import com.learning.spring.spring_aop.services.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
    	EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
    	
    	/* 1. Aspect method getNameAdvice will be executed before getEmployee().getName() executed.
    	 * 2. Aspect method getAllAdvice will be executed for each method with prefix get on 
    	 *    package com.learning.spring.spring_aop.services executed.
    	 * **/
    	
    	System.out.println("Employee Name:"+employeeService.getEmployee().getName());
    	Employee employee = employeeService.getEmployee();
    	employee.setSalary(35000);
    	
    	ctx.close();
    
       
    }
}
