package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotBlank(message = "Campo requerido")
	@Column(columnDefinition = "TEXT")
	private String text;
	private Long movieId; 
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, Long movieId) {
		super();
		this.id = id;
		this.text = text;
		this.movieId = movieId;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		movieId = entity.getMovie().getId();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	
	

}
