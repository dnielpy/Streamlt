package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Abre el navegador automáticamente después de iniciar el servidor
		try {
			Runtime.getRuntime().exec("cmd /c start http://localhost:8080");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}