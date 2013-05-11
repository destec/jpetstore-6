package lib.cat.petstore.persistence;

import java.util.List;

import lib.cat.petstore.entity.Order;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
