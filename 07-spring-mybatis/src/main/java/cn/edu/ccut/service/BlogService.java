package cn.edu.ccut.service;

import java.util.List;

import cn.edu.ccut.bo.Blog;

public interface BlogService {

	public List<Blog> selectAll();
	
	public void saveBlog(Blog blog);
}
