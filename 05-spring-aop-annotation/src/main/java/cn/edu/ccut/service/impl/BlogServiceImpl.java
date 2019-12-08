package cn.edu.ccut.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Override
	public List<Blog> selectAll() {
		List<Blog> result = new ArrayList<Blog>();
		result.add(new Blog(101,"Java","Java开发"));
		result.add(new Blog(102,"Python","Python开发"));
		result.add(new Blog(103,"PHP","PHP开发"));
		return result;
	}

}
