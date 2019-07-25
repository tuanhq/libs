package org.thq.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Example {
	public static void main(String[] args) {
		staticMethod();
	}
	public static void staticMethod() {
		
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		messages.stream().forEach(StringUtils::print);
		
		
	}
	public static void instanceMethod() {
		BicycleComparator bikeFrameSizeComparator = new BicycleComparator();
		List<Bicycle> listBicycle = new ArrayList<>();
		listBicycle.add(new Bicycle("sp1", 11));
		listBicycle.add(new Bicycle("sp2", 9));
		listBicycle.add(new Bicycle("sp3", 1));
		listBicycle.add(new Bicycle("sp4", 19));
		listBicycle.add(new Bicycle("sp5", 15));
		listBicycle.add(new Bicycle("sp6", 16));
		List<Bicycle> listOut = listBicycle.stream().sorted(bikeFrameSizeComparator::compare).collect(Collectors.toList());
		System.out.println(listOut);
	}
}
  class StringUtils{
	  public static void print(String a) {
		  System.out.println(a);
	  }
  }
 class Bicycle {
	 
    private String brand;
    private Integer frameSize;
    // standard constructor, getters and setters
    public Bicycle(String brand, Integer frameSize) {
		// TODO Auto-generated constructor stub
    	this.brand = brand;
    	this.frameSize = frameSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getFrameSize() {
		return frameSize;
	}
	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;
	}
    
    
}
 
 class BicycleComparator implements Comparator<Bicycle> {
 
    @Override
    public int compare(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }
 
}

