package lib.cat.petstore.controller;

import java.util.List;

import lib.cat.petstore.entity.Item;
import lib.cat.petstore.entity.Product;
import lib.cat.petstore.service.CatalogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/catalog")
public class CatalogController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Autowired
	private CatalogService catalogService;
	private List<Product> productionList;
	private List<Item> itemList;

	@RequestMapping(value = "/")
	public String main() {
		logger.info("Entering catalog main page! ");
		return "catalog/Main";
	}

	@RequestMapping(value="/category/{categoryId}")
	public String category(@PathVariable String categoryId, Model model) {
		
		logger.info("Enter category of " + categoryId);
		
		//show the list of items of certain category
		productionList = (List<Product>) catalogService.getProductListByCategory(categoryId);
		model.addAttribute("productionList", productionList);
		
		return "catalog/Category";
	}
	
	@RequestMapping("/product/{productId}")
	public String product(@PathVariable String productId, Model model) {
		
		logger.info("Enter product of " + productId);
		
		itemList = (List<Item>) catalogService.getItemListByProduct(productId);
		Product p = catalogService.getProduct(productId);
		model.addAttribute("itemList", itemList);
		model.addAttribute("product", p);
		
		return "catalog/Product";
	}
	
	@RequestMapping("/item/{itemId}")
	public String item(@PathVariable String itemId, Model model) {
		
		logger.info("Enter item of " + itemId);
		
		Item i = catalogService.getItem(itemId);
		Product p = i.getProduct();
		System.out.println(p.getDescription());
		model.addAttribute("item", i);
		model.addAttribute("product", p);
		
		return "catalog/Item";
	}
}