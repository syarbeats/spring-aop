package com.learning.spring.spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	@Before("getNamePointcut()")
	public void firstPointcutAdvice() {
		System.out.println("[firstPointcutAdvice - getNamePointCut()] Executing firstPointcutAdvice before getName executed...");
	}
	
	@Before("getNamePointcut()")
	public void secondPointcutAdvice() {
		System.out.println("[secondPointcutAdvice - getNamePointCut()] Executing secondPointcutAdvice before getName executed...");
	}
	
	@Pointcut("execution(String com.learning.spring.spring_aop.model.Employee.getName())")
	public void getNamePointcut() {
		
	}
	
	
}
