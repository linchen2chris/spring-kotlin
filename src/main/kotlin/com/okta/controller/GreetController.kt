package com.okta.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*

@RestController
class GreetController {

		@GetMapping("/greet")
		fun greet(): String {
				return "Hello World";
		}
}
