package cn.edu.ccut.bo;
 
import cn.edu.ccut.bo.User;
 
public class UserFactory {
 
    public User newInstance1(){
        return new User();
    }
    
    public static User newInstance2(){
        return new User();
    }
}