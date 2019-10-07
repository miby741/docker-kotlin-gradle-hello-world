package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

	@GetMapping("/demo")
	fun demo() : String {
		return "This is just a demo";
	}

}
