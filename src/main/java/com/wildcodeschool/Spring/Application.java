package com.wildcodeschool.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String doctor() {
		return "<ul>\n" +
				"        <li><a href=\" /doctor/10\">David Tennant</a></li>\n" +
				"        <li><a href=\" /doctor/11\">Matt Smith</a></li>\n" +
				"        <li><a href=\" /doctor/12\">Peter Capaldi</a></li>\n" +
				"        <li><a href=\" /doctor/13\">Jodie Whittaker13</a></li>\n" +
				"</ul>";
	}

	@GetMapping("/doctor/10")
	@ResponseBody
	public String showDoctor10() {
		return "<a href='https://en.wikipedia.org/wiki/David_Tennant'>Lien Wikipedia</a>";
	}

	@GetMapping("/doctor/11")
	@ResponseBody
	public String showDoctor11() {
		return "<a href='https://en.wikipedia.org/wiki/Matt_Smith_(actor)'>Lien Wikipedia</a>";
	}

	@GetMapping("/doctor/12")
	@ResponseBody
	public String showDoctor12() {
		return "<a href='https://en.wikipedia.org/wiki/Peter_Capaldi'>Lien Wikipedia</a>";
	}

	@GetMapping("/doctor/13")
	@ResponseBody
	public String showDoctor13() {
		return "<a href='https://en.wikipedia.org/wiki/Jodie_Whittaker'>Lien Wikipedia</a>";
	}

}
