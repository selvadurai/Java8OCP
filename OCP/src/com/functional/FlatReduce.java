package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatReduce {

	public static void main(String[] args) {
		List<String> id =Arrays.asList("1","2","3");
		List<String> name=Arrays.asList("Chunsa","Jin Yang","Lea");
        List<String> job =Arrays.asList("Student","programmer","citzen");
        Stream<List<String>> table =Stream.of(id,name,job);
        
        table.flatMap(l -> l.stream()).forEach(System.out::println);
	}

}
