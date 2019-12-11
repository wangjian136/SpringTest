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
    //进入控制器之前执行，true表示可以执行控制器，false表示不能执行控制器
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("我是preHandle");
        return true;
    }
 
    //控制器执行完成，进入jsp之前执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    	String username = httpServletRequest.getAttribute("username").toString();
        if(username.contains("垃圾")){
            username = username.replace("垃圾", "**");
        }
        httpServletRequest.setAttribute("username",username);
        System.out.println("我是postHandle");
    }
    //jsp执行完成后执行
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("我是afterCompletion");
    }
}