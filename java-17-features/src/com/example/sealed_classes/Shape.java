package com.example.sealed_classes;

public sealed interface Shape permits Circle,Square {

	void draw();
}
