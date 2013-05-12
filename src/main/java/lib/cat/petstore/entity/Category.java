package lib.cat.petstore.entity;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

	private static final long serialVersionUID = 3992469837058393712L;

	private String categoryId;
	private String name;
	private String description;
	private List<Product> productionList;

	public List<Product> getProductionList() {
		return productionList;
	}

	public void setProductionList(List<Product> productionList) {
		this.productionList = productionList;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return getCategoryId();
	}

}
