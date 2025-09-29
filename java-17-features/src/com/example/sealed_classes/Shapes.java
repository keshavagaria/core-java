package com.example.sealed_classes;

public abstract sealed class Shapes permits Circle, Square {

	public abstract double area();
}
