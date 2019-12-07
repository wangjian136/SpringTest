package cn.edu.ccut.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.edu.ccut.bo.Blog;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	
	@Autowired
	private Blog blog;

	@Test
	public void testSpringInit() {
		System.out.println(blog);
	}
}
