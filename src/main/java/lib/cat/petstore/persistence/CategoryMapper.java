package lib.cat.petstore.persistence;

import java.util.List;

import lib.cat.petstore.entity.Category;

public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
