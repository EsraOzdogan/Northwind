package NorthwindProject.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import NorthwindProject.northwind.entities.concretes.Product;

//JpaRepository--c#daki EntityBaseRepository
public interface ProductDao extends JpaRepository<Product,Integer>{       //interface interfacei exten eder //<Product--Entity, PrimaryKey--Integer> //Crud operasyonlar hazýr digerlerini yazmak da kolay

}
