package lib.cat.petstore.persistence;

import java.util.List;

import lib.cat.petstore.entity.Product;

public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProduct(String productId);

  List<Product> searchProductList(String keywords);

}
