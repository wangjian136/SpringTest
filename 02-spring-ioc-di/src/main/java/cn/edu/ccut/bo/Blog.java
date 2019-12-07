package cn.edu.ccut.bo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class Blog {

	private Integer id;
	private String name;
	private String descs;
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blog(Integer id, String name, String descs) {
		super();
		this.id = id;
		this.name = name;
		this.descs = descs;
	}
	public Integer getId() {
		return id;
	}
	//@Value("101")
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", name=" + name + ", descs=" + descs + "]";
	}
}
