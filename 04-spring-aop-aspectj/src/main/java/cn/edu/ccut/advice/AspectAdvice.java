package cn.edu.ccut.advice;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class AspectAdvice {
 
    public void beforeAdvice(){
        System.out.println("����ǰ��֪ͨ��");
    }
 
    public void afterAdvice(){
        System.out.println("���Ǻ���֪ͨ��");
    }
 
    public void exception(){
        System.out.println("�����쳣֪ͨ��");
    }
 
    public Object aroundAdvice(ProceedingJoinPoint p) throws Throwable{
        System.out.println("����֪ͨ-ǰ��");
        Object proceed = p.proceed();
        System.out.println("����֪ͨ-����");
        return proceed;
    }
}