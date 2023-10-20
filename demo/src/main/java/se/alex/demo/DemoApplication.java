package se.alex.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		}

	@Override
	public void run(String... args) throws Exception {
		var objectMapper = new ObjectMapper();

		Variable var = objectMapper.readValue(new URL("https://raw.githubusercontent.com/aspcodenet/esp32ota/main/bin/firmware.json"),Variable.class); //Vi instansierar med BlogPost för att det är där våra variablar ligger.
		String json2 = objectMapper.writeValueAsString(var);
		System.out.println("Value of string: " + var);

	}
}


