package NorthwindProject.northwind.business.abstracts;

import java.util.List;

import NorthwindProject.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();

}
