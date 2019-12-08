package cn.edu.ccut.advice;
 
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
 
@Component
@Aspect
public class AspectAdvice {
 
    @Before("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public void beforeAdvice(){
        System.out.println("我是前置通知！");
    }
 
    @AfterReturning("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public void afterAdvice(){
        System.out.println("我是后置通知！");
    }
 
    @AfterThrowing("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public void exception(){
        System.out.println("我是异常通知！");
    }
 
    @Around("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint p) throws Throwable{
        System.out.println("环绕通知-前置");
        Object proceed = p.proceed();
        System.out.println("环绕通知-后置");
        return proceed;
    }
}