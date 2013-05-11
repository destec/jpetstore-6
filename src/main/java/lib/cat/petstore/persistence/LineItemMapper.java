package lib.cat.petstore.persistence;

import java.util.List;

import lib.cat.petstore.entity.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
