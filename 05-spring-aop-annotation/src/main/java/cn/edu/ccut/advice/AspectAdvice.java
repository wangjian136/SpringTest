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
        System.out.println("����ǰ��֪ͨ��");
    }
 
    @AfterReturning("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public void afterAdvice(){
        System.out.println("���Ǻ���֪ͨ��");
    }
 
    @AfterThrowing("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public void exception(){
        System.out.println("�����쳣֪ͨ��");
    }
 
    @Around("execution(* cn.edu.ccut.service.impl.BlogServiceImpl.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint p) throws Throwable{
        System.out.println("����֪ͨ-ǰ��");
        Object proceed = p.proceed();
        System.out.println("����֪ͨ-����");
        return proceed;
    }
}