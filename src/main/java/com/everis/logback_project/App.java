package com.everis.logback_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Primer desafío de Logback
 * 
 * @author Luis Rafael Arroyo Caballero
 *
 */
public class App {

	/** Constante LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Inicio del método");
		
		for (int i = 0; i <= 5000; i++) {
			LOGGER.debug("Iteración número: {}",i);
		}
		
		LOGGER.info("Fin del método");
	}
}

