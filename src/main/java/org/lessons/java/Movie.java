package org.lessons.java;

public class Movie {
	private String titolo;
	private int id;

	public Movie(String titolo, int id) {
		super();
		this.titolo = titolo;
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Movie [titolo=" + titolo + "]";
	}
	

}
