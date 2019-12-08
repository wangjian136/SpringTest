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
		result.add(new Blog(101,"Java","Java����"));
		result.add(new Blog(102,"Python","Python����"));
		result.add(new Blog(103,"PHP","PHP����"));
		return result;
	}

}
