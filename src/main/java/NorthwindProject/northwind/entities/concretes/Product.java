package NorthwindProject.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    //getter-setter
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
     
    @Id                                                    //Tablonun idsi-sorgular bu idye göre olur
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Ýdnin nasil artmasý gerektigini belitmek icin- Biz bir bir arttiriyoruz
    @Column(name="product_id")                              //Hangi alan hangi alana karsilik geliyor.Hangi tablo hangi kolona karsilik geliyor.Tablodai column ismi ile ayni olacak
	private int id;
    
    @Column(name="category_id")
	private int categoryId;
    
    @Column(name="product_name")
	private String productName;
    
    @Column(name="unit_price")
	private double unitPrice;
    
    @Column(name="units_in_stock")
	private short unitsInStock;
    
    @Column(name="quantity_per_unit")
	private String quantityPerUnit;
    
   /* @ManyToOne()
    @JoinColumn(name="category_id")
    private Category category;*/
	

}
