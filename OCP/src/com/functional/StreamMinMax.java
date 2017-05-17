package com.functional;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinMax {

	public static void main(String[] args) {
		 Stream<String> s = Stream.of("Monkey","Chunsa","Bonoobo","ape");
		 Optional<String> min = s.min( (s1,s2) -> s1.length()-s2.length() );
		 min.ifPresent(System.out::println);

		 //Reduce API
		 Stream<String> stream = Stream.of("W","o","l","f");
		 String         word   = stream.reduce("",(h,cat)->h+cat );
		 System.out.println(word);
		 
	}

}
