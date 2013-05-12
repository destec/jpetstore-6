package lib.cat.petstore.controller;

import java.util.List;

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
	//private Category category = new Category();

	@RequestMapping(value = "/")
	public String main() {
		logger.info("Entering catalog main page! ");
		return "catalog/Main";
	}

	@RequestMapping(value="/category/{categoryId}")
	public String category(@PathVariable String categoryId, Model model) {
		logger.info("Enter category of " + categoryId);
		//model.addAttribute(categoryId);
		//show the list of items of certain category
		//productionList = catalogService.getProductListByCategory(categoryId);
		productionList = (List<Product>) catalogService.getProductListByCategory(categoryId);
		String pro1 = productionList.get(0).toString();
		System.out.println(productionList + "" + pro1);
		//model.addAttribute(test);
		model.addAttribute("productionList", productionList);
		model.addAttribute("pro1", pro1);
		return "catalog/Category";
	}
}