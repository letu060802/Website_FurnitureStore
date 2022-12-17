package poly.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.store.entity.Product;
import poly.store.service.ProductService;

@Controller
public class ShoppingCartController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/cart/view")
	public String view() {
		return "cart/view";
	}
//	
//	@RequestMapping("/cart/view")
//	public String detail(Model model)
//	{
//		List<Product> items = productService.findAll();
//		model.addAttribute("items",items);
//		return "layout/_cart";
//	}
//	@RequestMapping("/cart/view/{id}")
//	public String detail(Model model,@PathVariable("id")Integer id )
//	{
//		Product item = productService.findById(id);
//		model.addAttribute("item",item);
//		return "layout/_cart";
//	}

}
