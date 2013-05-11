package lib.cat.petstore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/catalog")
public class CatalogController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/")
	public String main() {
		logger.info("Entering catalog main page! ");
		return "catalog/Main";
	}

	@RequestMapping(value="/category/{categoryId}")
	public String catagory(@PathVariable String categoryId, Model model) {
		logger.info("Enter category of " + categoryId);
		model.addAttribute(categoryId);
		return "catalog/Category";
	}
}