package com.docsconsole.tutorials.spring5aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ProductLoggingAspect {
     
	@After("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.getProductById(..))")
    public void logAfterGetProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAfterGetProduct() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.createProduct(..))")
    public void logAfterCreateProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAfterCreateProduct() : " + joinPoint.getSignature().getName());
    }
}	