package com.baizhi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {

    @Pointcut("@annotation(Log)")
    public void pointCut(){
        System.out.println("-----pointCout------");
    }

    @Around(value = "pointCut()" )
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
            System.out.println("-------around------");
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return proceed;
    }


}
