package Streams;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilterDemo4 
{
	public static void main(String[] args)
	{
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",24000));
		productsList.add(new Product(2,"Dell Laptop",30000));
		productsList.add(new Product(3,"Apple Laptop",80000));
		productsList.add(new Product(4,"Chrome Laptop",20000));
		productsList.add(new Product(5,"Lenova Laptop",28000));
		//filtering and printing the price for products having price >25000
		productsList.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price));
	}
}
