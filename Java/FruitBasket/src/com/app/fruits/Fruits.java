package com.app.fruits;

public abstract class Fruits {
	private String color;
	private String name;
	private double weight;
	private boolean fresh;

	public Fruits(String color, String name, double weight) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		fresh = true;
	}

	public abstract String taste();

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString() {
		return "Name=" + this.name + " " + "Color=" + this.color + " " + "Weight=" + this.weight;
	}

}
