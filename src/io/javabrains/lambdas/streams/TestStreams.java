package io.javabrains.lambdas.streams;

import java.util.Arrays;
import java.util.List;

public class TestStreams {

	public static void main(String[] args) {
		List<People> list = Arrays.asList(new People(1, "rajini", "boss"), new People(2, "vijay", "sethupathy"),
				new People(3, "vikram", "chiyyan"), new People(4, "ajith", "thala"));

		list.stream().forEach((p) -> System.out.println(p.toString()));
	}

}
