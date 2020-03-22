package com.springframework.spring5jokesapp;

//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Component
public class ChuckConfig {

	//@Bean
	public ChuckNorrisQuotes getChuckNorrisObj() {
		return new ChuckNorrisQuotes();
	}
}
