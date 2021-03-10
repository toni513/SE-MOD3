package com.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.*;

@JsonIgnoreProperties
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Movie {
	private int movie_id;
	private String title;
	private String director;
	private int year;
	private String genre;

}
	