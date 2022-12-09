package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;



public interface ReviewRepository extends JpaRepository<Movie, Long> {
	@Query("SELECT obj FROM Review obj WHERE "
	        + "(obj.user = :user) AND "
	        + "(obj.movie.id = :id) ")	
	List<Review> find(User user, Long id);
}