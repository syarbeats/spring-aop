package com.learning.spring.spring_aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {

	/* 1. Aspect method firstAdvice will be executed after all method in package 
	 * com.learning.spring.spring_aop.services that having suffix get* executed.
	 * **/
	@After("execution(* com.learning.spring.spring_aop.services.*.get*())")
	public void firstAdvice() {
		System.out.println("[First Advice - AFTER-GET-METHOD] Executing firstAdvice after getName executed...");
	}
	
	/* 1. Aspect method secondAdvice will be executed after method setSalary executed.
	 * **/
	@After("execution(* com.learning.spring.spring_aop.model.Employee.setSalary(int))")
	public void secondAdvice() {
		System.out.println("[Second Advice - AFTER-SET-METHOD] Executing secondAdvice after setSalary executed...");
	}
	
}
