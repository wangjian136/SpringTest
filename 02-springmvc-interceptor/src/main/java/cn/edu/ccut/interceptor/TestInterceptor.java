package cn.edu.ccut.interceptor;
 
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * @Auther:jwang
 * @Date:2019/12/11
 * @Description:cn.edu.ccut.interceptor
 * @Version 1.0
 **/
public class TestInterceptor implements HandlerInterceptor {
    //���������֮ǰִ�У�true��ʾ����ִ�п�������false��ʾ����ִ�п�����
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("����preHandle");
        return true;
    }
 
    //������ִ����ɣ�����jsp֮ǰִ��
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    	String username = httpServletRequest.getAttribute("username").toString();
        if(username.contains("����")){
            username = username.replace("����", "**");
        }
        httpServletRequest.setAttribute("username",username);
        System.out.println("����postHandle");
    }
    //jspִ����ɺ�ִ��
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("����afterCompletion");
    }
}