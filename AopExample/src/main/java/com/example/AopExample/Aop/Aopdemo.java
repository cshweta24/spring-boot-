package com.example.AopExample.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect

@Component
public class Aopdemo {
   // @After(value = "execution(* com.example.AopExample.Controller.Cont.data(..))")

    @After(value=" execution (* com.example.AopExample.Controller.Cont.check(..))")

  public void checkaop(){
        System.out.println("execute");
    }


   // @Around("execution(* com.example.AopExample.Controller.Cont.data(..))")
  //  public Object checkAround(ProceedingJoinPoint proceedingJoinPoint){
         //   public void checkAround(){
       // System.out.println("Invoking data method");
//        Object value = null;
//        try {
// proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
       // System.out.println("After invoking data method.");

//}
}