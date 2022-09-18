package com.lavanderia.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public void irHome() {
		System.out.println("Hola");
	}
}
