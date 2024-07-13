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

        // Limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Abre el navegador automáticamente después de iniciar el servidor
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:8080");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime el texto en la consola
        System.out.println("  ____  _                            _ _   ");
        System.out.println(" / ___|| |_ _ __ ___  __ _ _ __ ___ | | |_ ");
        System.out.println(" \\___ \\| __| '__/ _ \\/ _` | '_ ` _ \\| | __|");
        System.out.println("  ___) | |_| | |  __/ (_| | | | | | | | |_ ");
        System.out.println(" |____/ \\__|_|  \\___|\\__,_|_| |_| |_|_|\\__|");

    }
}