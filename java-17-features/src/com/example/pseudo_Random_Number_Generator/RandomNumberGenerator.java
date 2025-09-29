package com.example.pseudo_Random_Number_Generator;

import java.util.random.RandomGenerator;

public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		
		RandomGenerator rng = RandomGenerator.of("L128X128MixRandom");
		System.out.println(rng.nextInt(100));
	}

}
