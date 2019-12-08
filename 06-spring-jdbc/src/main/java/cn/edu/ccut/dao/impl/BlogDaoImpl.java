package cn.edu.ccut.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.edu.ccut.bo.Blog;
import cn.edu.ccut.dao.BlogDao;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Blog> doListAll() {
		String sql = " select * from blog ";
		List<Blog> list = jdbcTemplate.query(sql, new BlogRowMapper());
		return list;
	}
	
	
	@Override
	public void doCreateBlog(Blog blog) {
		String sql = " insert into blog(id,name,descs) values (?,?,?) ";
		jdbcTemplate.update(sql, blog.getId(), blog.getName(), blog.getDescs());
	}
	
	
	
	
	
	class BlogRowMapper implements RowMapper<Blog> {

		@Override
		public Blog mapRow(ResultSet rs, int rowNum) throws SQLException {
			Blog blog = new Blog();
			blog.setId(rs.getInt("id"));
			blog.setName(rs.getString("name"));
			blog.setDescs(rs.getString("descs"));
			return blog;
		}
		
    }
}
