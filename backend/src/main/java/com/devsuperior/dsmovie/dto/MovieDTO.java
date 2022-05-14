package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private Long id;
	private String tittle;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDTO(Long id, String tittle, Double score, Integer count, String image) {
		this.id = id;
		this.tittle = tittle;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		id = movie.getId();
		tittle = movie.getTittle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
