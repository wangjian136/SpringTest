package cn.edu.ccut.dao;

import java.util.List;

import cn.edu.ccut.bo.Blog;

public interface BlogDao {

	public List<Blog> doListAll();
	
	public void doCreateBlog(Blog blog);
}
