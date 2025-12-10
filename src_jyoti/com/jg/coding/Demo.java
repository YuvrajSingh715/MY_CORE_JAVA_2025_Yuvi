package com.jg.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// given question is[[1,"abc",2004],[2,"qwe",2010],[3,"tyu",2003]] Sort By Years
public class Demo{

public static void main(String[] args){

List<Object[]> list= Arrays.asList(
	new Object[]{1, "jyoti", 2003},
	new Object[] {2, "yuvraj", 2009},
	new Object[]{3,"abhishek",2005}
	
);
List<Object[]> sortedByYear =list.stream().sorted(Comparator.comparing(p->(Integer) p[2])).collect(Collectors.toList());

	sortedByYear.forEach(i-> System.out.println(Arrays.toString(i)));
	
}

}