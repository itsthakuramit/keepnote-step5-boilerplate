package com.stackroute.keepnote.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* Annotate this class with @Aspect and @Component */

public class LoggingAspect {
	/*
	 * Write loggers for each of the methods of User controller, any particular
	 * method will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
	
	Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.stackroute.keepnote.controller.*")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("Inside Before Advice"+joinPoint.getSignature().getName());
	}
	
	
	@After("execution(* com.stackroute.keepnote.controller.*)")
	public void logAfter(JoinPoint joinPoint) {
		logger.info("Inside After Advice "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.stackroute.keepnote.controller.*)")
	public void logAfterReturning(JoinPoint joinPoint) {
		logger.info("Inside AfterReturning Advice "+joinPoint.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.stackroute.keepnote.controller.*)")
	public void logAfterThrowing(JoinPoint joinPoint){
		logger.info("Inside AfterThrowing Advice "+joinPoint.getSignature().getName());
	}
}
