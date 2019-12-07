package cn.edu.ccut.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.bo.User;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	
	@Autowired
	//@Qualifier("blog3")
	private Blog blog;
	
	/*@Resource
	private User user02;*/

	@Test
	public void testSpringInit() {
		//System.out.println(blog);
		System.out.println(blog);
	}
}
