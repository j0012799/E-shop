package cn.it.shop.model;

import javax.persistence.Entity;


/**
 * Category entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Category implements java.io.Serializable {

	// Fields
	private Integer id;
	private String type;
	private Boolean hot;
//	private Set<Product> products = new HashSet<Product>(0);
	
	public Category() {
		super();
	}	
	
	public Category(String type, Boolean hot) {
		super();
		this.type = type;
		this.hot = hot;
	}
	
	public Category(Integer id, String type, Boolean hot) {
		super();
		this.id = id;
		this.type = type;
		this.hot = hot;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getHot() {
		return hot;
	}
	public void setHot(Boolean hot) {
		this.hot = hot;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + ", hot=" + hot + "]";
	}

}