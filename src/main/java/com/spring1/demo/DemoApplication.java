package com.spring1.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring1.demo.controllers.InformacionProyecto;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/proyectoSpring")

	public InformacionProyecto MessageView(){
		
		return new InformacionProyecto(LocalDateTime.now(),"Leo", "Chavarro", "2675793");
	}
}
