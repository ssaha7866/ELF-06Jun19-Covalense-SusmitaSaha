package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class StreamTestThree {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		List<Integer> x = al.stream().map(i -> i *2).collect(Collectors.toList());
		log.info("" + x);
	}

}
