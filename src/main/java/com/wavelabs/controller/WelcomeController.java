package com.wavelabs.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author rajashekhar
 *
 */
@RestController
@EnableAutoConfiguration
public class WelcomeController {
	@RequestMapping("/hello")
	String home() {
		return "Hello World!";
	}
}
