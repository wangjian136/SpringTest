package cn.edu.ccut.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.dao.BlogDao;

@Repository
public class BlogDaoImpl implements BlogDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public Blog selectBlog(Integer id) {
		return hibernateTemplate.get(Blog.class, id);
	}

	@Override
	public List<Blog> selectAllBlog() {
		return hibernateTemplate.findByExample(new Blog(null, null, null));
	}

	@Override
	public void createBlog(Blog blog) {
		hibernateTemplate.save(blog);
	}

}
