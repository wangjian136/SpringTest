package cn.edu.ccut.advice;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class AspectAdvice {
 
    public void beforeAdvice(){
        System.out.println("我是前置通知！");
    }
 
    public void afterAdvice(){
        System.out.println("我是后置通知！");
    }
 
    public void exception(){
        System.out.println("我是异常通知！");
    }
 
    public Object aroundAdvice(ProceedingJoinPoint p) throws Throwable{
        System.out.println("环绕通知-前置");
        Object proceed = p.proceed();
        System.out.println("环绕通知-后置");
        return proceed;
    }
}