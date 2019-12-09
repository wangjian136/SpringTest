package cn.edu.ccut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.mapper.BlogMapper;
import cn.edu.ccut.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogMapper blogMapper;

	@Override
	public List<Blog> selectAll() {
		return blogMapper.selectAllBlog();
	}

	@Override
	public void saveBlog(Blog blog) {
		blogMapper.createBlog(blog);
	}

}
