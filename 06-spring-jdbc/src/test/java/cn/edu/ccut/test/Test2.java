package cn.edu.ccut.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.ccut.bo.Blog;

public class Test2 {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Blog blog = ac.getBean("blog",Blog.class);
		System.out.println(blog);
	}
}
