package NorthwindProject.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NorthwindProject.northwind.business.abstracts.ProductService;
import NorthwindProject.northwind.entities.concretes.Product;

@RestController  //sen REstContrller'sin dedik yani android ve iosda karsilar
@RequestMapping("/api/products")            //products icin controller dedik requestcontroller ile
public class ProductsController {
	
//	@Autowired--tek Service'de
   private ProductService productService;
	
	
	@Autowired
	public ProductsController(ProductService productService) {  //IoC gibi katmanlar� bagliyorPorductService-ProductManager ve -ProductManager ile ProductDao kullaniliyor
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")   //GetMapping--veri istemek icin,getall-t�m verileri istemek icin
	public List<Product> getAll(){
		return this.productService.getAll();
	}

}
