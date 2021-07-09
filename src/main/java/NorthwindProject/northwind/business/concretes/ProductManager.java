package NorthwindProject.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NorthwindProject.northwind.business.abstracts.ProductService;
import NorthwindProject.northwind.dataAccess.abstracts.ProductDao;
import NorthwindProject.northwind.entities.concretes.Product;

@Service  //Bu class prjede service görevi görecek demek
public class ProductManager implements ProductService{

	private ProductDao productDao;            //dataAccesle erisim icin
	
	@Autowired      //önceki dersteki injection gibi         //beans-class    //ProductDao nun instance'i icin
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public List<Product> getAll() {
		return this.productDao.findAll(); //findAll'a parametre vermeyince hepsini getirir
	}

}
