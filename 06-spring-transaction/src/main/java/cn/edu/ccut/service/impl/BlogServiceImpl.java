package cn.edu.ccut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.dao.BlogDao;
import cn.edu.ccut.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogDao blogDao;

	@Override
	public List<Blog> selectAll() {
		return blogDao.doListAll();
	}

	@Override
	public void saveBlog(Blog blog) {
		blogDao.doCreateBlog(blog);
	}

}
