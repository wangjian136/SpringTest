package cn.edu.ccut.bo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private Blog blog;
	private String [] strs;
	private List<String> list;
	private Set<String> set;
	private Map<String,Blog> map;
	private Properties properties;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Blog blog, String[] strs, List<String> list, Set<String> set, Map<String, Blog> map,
			Properties properties) {
		super();
		this.blog = blog;
		this.strs = strs;
		this.list = list;
		this.set = set;
		this.map = map;
		this.properties = properties;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public String[] getStrs() {
		return strs;
	}
	public void setStrs(String[] strs) {
		this.strs = strs;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, Blog> getMap() {
		return map;
	}
	public void setMap(Map<String, Blog> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "User [blog=" + blog + ", strs=" + Arrays.toString(strs) + ", list=" + list + ", set=" + set + ", map="
				+ map + ", properties=" + properties + "]";
	}
	
	
}
