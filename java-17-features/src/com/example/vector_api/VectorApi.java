package com.example.vector_api;
import jdk.incubator.vector.FloatVector;

public class VectorApi {
	
	public static void main(String[] args) {
		
		float[] arr = {1.0f,2.0f,3.0f,4.0f};
		for(int i=0; i<arr.length;i++) {
			arr[i] = arr[i] * 2.0f;
		}
		
	var vector = FloatVector.fromArray(FloatVector.SPECIES_128, 
			new float[] {1.0f,2.0f,3.0f,4.0f});
	var result = ((FloatVector) vector).mul(2.0f);
	}

}
