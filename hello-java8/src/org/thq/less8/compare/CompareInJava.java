package org.thq.less8.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareInJava {
	public static void main(String[] args) {
		exampleUsingComparable();
		exampleUsingCompartor();
	}
	public static void exampleUsingComparable() {
		//class in collection implement Comparable
		List<Product> listProduct = new ArrayList<Product>();
		listProduct.add(new Product("sp1", 1.6));
		listProduct.add(new Product("sp2", 1.4));
		listProduct.add(new Product("sp3", 1.6));
		listProduct.add(new Product("sp4", 1.7));
		listProduct.add(new Product("sp5", 1.41));
		System.out.println("list origin:"+listProduct);
		Collections.sort(listProduct);
		System.out.println("list after using comparable:"+listProduct);
		
		
		//
	}
	public static void exampleUsingCompartor() {
		List<Product> listProduct = new ArrayList<Product>();
		listProduct.add(new Product("sp1", 1.6));
		listProduct.add(new Product("sp2", 1.4));
		listProduct.add(new Product("sp3", 1.6));
		listProduct.add(new Product("sp4", 1.7));
		listProduct.add(new Product("sp5", 1.41));
		System.out.println("list origin:"+listProduct);
		Collections.sort(listProduct, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice()>o2.getPrice()) {
					return -1;
				}
				if(o1.getPrice() <o2.getPrice()) {
					return 1;
				}
				return 0;
			}
		});
		System.out.println("list after using comparator:"+listProduct);
	}

}
class Product implements Comparable<Product>{
	private String name;
	private double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+price;
	}
	@Override
	public int compareTo(Product o) {
		if(this.price > o.price ) {
			return 1;
		}else if(this.price < o.price) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
