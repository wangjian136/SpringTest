package cn.edu.ccut.advice;
 
import org.springframework.aop.MethodBeforeAdvice;
 
import java.lang.reflect.Method;
 
public class TestBeforeAdvice implements MethodBeforeAdvice {
 
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("我是前置通知！");
    }
}