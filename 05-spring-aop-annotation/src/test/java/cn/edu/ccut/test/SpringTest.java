package cn.edu.ccut.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.edu.ccut.service.BlogService;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	
	@Autowired
	private BlogService blogService;

	@Test
	public void testSpringInit() {
		blogService.selectAll();
	}
}
