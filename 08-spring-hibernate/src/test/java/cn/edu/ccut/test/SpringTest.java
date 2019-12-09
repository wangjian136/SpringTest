package cn.edu.ccut.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.service.BlogService;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	
	@Autowired
	private BlogService blogService;

	@Test
	public void testSpringInit() {
		//System.out.println(blogService.selectAll());
		
		//System.out.println(blogService.selectBlogById(101));
		
		Blog blog = new Blog();
		blog.setName("sss");
		blog.setDescs("sss");
		blogService.saveBlog(blog);
	}
}
