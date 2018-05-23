/**
 * 
 */
package com.demo.ff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rujuta Manjrekar
 *
 */
@RestController
public class GreetingsController {

	@Value("${greeting}")
	private String greet;
	
	@GetMapping("/greet")
	public String getGreeting() {
		return greet;
	}
	
}
