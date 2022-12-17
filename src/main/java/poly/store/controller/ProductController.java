package poly.store.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import poly.store.entity.Product;
import poly.store.service.ProductService;



@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(Model model,@RequestParam("cid")Optional<String> cid) {
		if(cid.isPresent()) {
			List<Product> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items",list);
		}else {
			List<Product> list = productService.findAll();
			model.addAttribute("items",list);
		}
		
		return "product/list";
	}
	
	@RequestMapping("/product/index")
	public String index(Model model){
		List<Product> list = productService.findAll();
		model.addAttribute("items", list.stream().limit(12).collect(Collectors.toList()));
		return "product/list";
	}
	
	@RequestMapping("/product/shop")
	public String shop(Model model,@RequestParam("cid")Optional<String> cid){
		if(cid.isPresent()) {
			List<Product> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items",list);
		}else {
			List<Product> list = productService.findAll();
			model.addAttribute("items",list);
		}
		return "product/shop";
	}
	
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model,@PathVariable("id")Integer id )
	{
		Product item = productService.findById(id);
		model.addAttribute("item",item);
		return "product/detail";
	}
}
