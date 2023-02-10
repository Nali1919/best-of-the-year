package org.lessons.java;

public class Song {

	private String titolo;
	private int id;

	public Song(String titolo, int id) {
		super();
		this.titolo = titolo;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	@Override
	public String toString() {
		return "Song [titolo=" + titolo + "]";
	}

	
}
