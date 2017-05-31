package com.itheima.spring.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 切面类：注解的切面类
 * @author jt
 */
@Aspect
@Service("11111")
public class MyAspectAnno {

	@Before("execution(* com.itheima.spring.demo1.OrderDao.save(..))")
	public void before(){
		System.out.println("前置增强===========");
	}
	
	// 后置通知:
	
	public void afterReturning(Object result){
		System.out.println("后置增强==========="+result);
	}
	
	// 环绕通知:
	@Around("execution(* com.itheima.spring.demo1.OrderDao.update(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前增强==========");
		Object obj  = joinPoint.proceed();
		System.out.println("环绕后增强==========");
		return obj;
	}
	
	// 异常抛出通知:
	
	public void afterThrowing(Throwable e){
		System.out.println("异常抛出增强========="+e.getMessage());
	}
	
	// 最终通知
	
	public void after(){
		System.out.println("最终增强============");
	}
	
	// 切入点注解：
	@Pointcut(value="execution(* com.itheima.spring.demo1.OrderDao.find(..))")
	private void pointcut1(){}
	@Pointcut(value="execution(* com.itheima.spring.demo1.OrderDao.save(..))")
	private void pointcut2(){}
	@Pointcut(value="execution(* com.itheima.spring.demo1.OrderDao.update(..))")
	private void pointcut3(){}
	@Pointcut(value="execution(* com.itheima.spring.demo1.OrderDao.delete(..))")
	private void pointcut4(){}
}
