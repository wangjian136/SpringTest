package cn.edu.ccut.advice;
 
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
 
import java.lang.reflect.Method;
 
public class TestAfterAdvice implements AfterReturningAdvice {
 
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("我是后置通知！");
    }
}