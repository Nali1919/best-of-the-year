package org.lessons.java;

public class Animali {

	private String razza;

	public Animali(String razza) {
		super();
		this.razza = razza;
	}

	public String getRazza() {
		return razza;
	}

	@Override
	public String toString() {
		return "Animali [razza=" + razza + "]";
	}

}
