package com.learning.spring.spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class EmployeeAroundAspect {

	private final Logger logger = LoggerFactory.getLogger(EmployeeAroundAspect.class);
	
	@Around("execution(* com.learning.spring.spring_aop.model.Employee.getSalary())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		/* 1. calling method right here will be executed before getSalary executed.
		 * **/
		System.out.println("Before invoking getSalary()...");
		Object value = null;

		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		/* 2. calling method right here will be executed after getSalary executed.
		 * **/
		System.out.println("After invoking getSalary() with return value: "+ value);
		return value;
	}
	
	/*@Pointcut("* com.learning.spring.spring_aop.model.Employee.getSalary()")
    public void methodExecution(){
    }*/
	
	@AfterReturning(pointcut = "execution(int com.learning.spring.spring_aop.model.Employee.getSalary())", returning="result")
	public void employeeAfterReturningAdvice(JoinPoint joinpoint, Object result) {
		logger.info("LOG:: The method {} ends with value {} ", joinpoint.getSignature().getName(), result);
	}
	
}
