package com.learning.spring.spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	/* 1. Aspect method getNameAdvice will be executed before getEmployee().getName() executed.
	 * **/
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice before getName() method executed...");
	}
	
	/* 
	 * 2. Aspect method getAllAdvice will be executed for each method with prefix get on 
	 *    package com.learning.spring.spring_aop.services executed.
	 * **/
	@Before("execution(* com.learning.spring.spring_aop.services.*.get*())")
	public void getAllAdvice() {
		System.out.println("Executing Advice before all method on package com.learning.spring.spring_aop.services that having suffix get* method executed...");
	}
}
