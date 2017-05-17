package com.functional;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupLamda {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		LocalDate d1 =s1.get();
		System.out.println(d1);

	}

}
