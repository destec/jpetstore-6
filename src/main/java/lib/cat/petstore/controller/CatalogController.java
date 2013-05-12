package lib.cat.petstore.controller;

import java.util.List;

import lib.cat.petstore.entity.Product;
import lib.cat.petstore.service.CatalogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/catalog")
public class CatalogController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	private CatalogService catalogService = new CatalogService();
	private List<Product> productionList;
	//private Category category = new Category();

	@RequestMapping(value = "/")
	public String main() {
		logger.info("Entering catalog main page! ");
		return "catalog/Main";
	}

	@RequestMapping(value="/category/{categoryId}")
	public String catagory(@PathVariable String categoryId, Model model) {
		logger.info("Enter category of " + categoryId);
		model.addAttribute(categoryId);
		//show the list of items of certain category
		//productionList = catalogService.getProductListByCategory(categoryId);
		System.out.println(catalogService.getCategory(categoryId));
		model.addAttribute(productionList);
		return "catalog/Category";
	}
}