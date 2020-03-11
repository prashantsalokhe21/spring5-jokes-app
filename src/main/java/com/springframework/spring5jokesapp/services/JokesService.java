package com.springframework.spring5jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesService {

	public String generateRandomJokes() {
		ChuckNorrisQuotes randomJokes = new ChuckNorrisQuotes();
		return randomJokes.getRandomQuote();
	}

}
