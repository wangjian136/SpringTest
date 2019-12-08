package cn.edu.ccut.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.bo.Blog2;

public class Test2 {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Blog2 blog = ac.getBean("blog2",Blog2.class);
		System.out.println(blog);
	}
}
