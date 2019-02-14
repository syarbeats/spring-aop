package com.learning.spring.spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	/*@Before("getNamePointcut()")
	public void firstAdvice() {
		System.out.println("[First Advice - getNamePointCut()] Executing firstAdvice on before getName executed...");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice() {
		System.out.println("[Second Advice - getNamePointCut()] Executing secondAdvice on before getName executed...");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {};*/
	
	
}
