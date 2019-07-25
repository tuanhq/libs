package org.thq.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		//filterWithoutStream();
		//filterUsingStream();
		//mapWithoutStream();
		//mapUsingStream();
		//limitUsignStream();
		//sortedUsingStream();
		streamCollect();
		
		
	}
	public static void filterWithoutStream() {
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut = new ArrayList<>();
		for(Integer i : listInt) {
			if(i.compareTo(5)>=0) {
				listIntOut.add(i);
			}
		}
		System.out.println("list after filter");
		System.out.println(listIntOut);
	}
	public static void filterUsingStream() {
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut = listInt.stream().filter(i->i.compareTo(5)>=0).collect(Collectors.toList());
		System.out.println("list after filter");
		System.out.println(listIntOut);
	}
	
	public static void mapWithoutStream() {
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut = new ArrayList<>();
		for(Integer i : listInt) {
			i = i*2;
			listIntOut.add(i);
		}
		System.out.println("list after filter");
		System.out.println(listIntOut);
	}
	public static void mapUsingStream() {
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut = listInt.stream().map(i->i*2).collect(Collectors.toList());
		List<String> listStringOut = listInt.stream().map(i->String.valueOf(i*2)).collect(Collectors.toList());
		System.out.println("list after filter");
		System.out.println(listIntOut);
		System.out.println(listStringOut);
	}
	
	public static void limitUsignStream() {
		
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut = listInt.stream().limit(2).collect(Collectors.toList());
		
		System.out.println("list after filter");
		System.out.println(listIntOut);
		
		
	}
	public static void sortedUsingStream() {
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4);
		System.out.println("list befor filter");
		System.out.println(listInt);
		List<Integer> listIntOut1 = listInt.stream().sorted().collect(Collectors.toList());
		List<Integer> listIntOut2 = listInt.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		List<Integer> listIntOut3 = listInt.stream().sorted((a,b)->{
			if(a>b) return -1;
			if(a<b ) return 1;
			return 0;
		}).collect(Collectors.toList());
		System.out.println("list after filter");
		System.out.println("list1:"+listIntOut1);
		System.out.println("list2:"+listIntOut2);
		System.out.println("list3:"+listIntOut3);
		
	}
	public static void streamCollect() {
		
		List<Integer> listInt = Arrays.asList(5,7,8,14,1,2,4,5,7);
		System.out.println("list befor filter");
		System.out.println(listInt);
		//collect to list
		List<Integer> listIntOut = listInt.stream().distinct().collect(Collectors.toList());
		System.out.println("list intout:"+listIntOut);
		//collect to set
		Set<Integer> setIntOut = listInt.stream().distinct().collect(Collectors.toSet());
		System.out.println("list setout:"+setIntOut);
		//collect to map
		Map<String, Integer> mapStringInt = listInt.stream().distinct().collect(Collectors.toMap(i->String.valueOf(i), i->i));
		System.out.println("list map out:"+mapStringInt);
	}
	
	  
}
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}

