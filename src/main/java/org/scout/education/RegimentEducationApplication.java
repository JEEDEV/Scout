package org.scout.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ComponentScan({"org.scout.education"})
public class RegimentEducationApplication {

	@ResponseBody
	@RequestMapping("/")
	String entry()
	{
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RegimentEducationApplication.class, args);
	}
}
