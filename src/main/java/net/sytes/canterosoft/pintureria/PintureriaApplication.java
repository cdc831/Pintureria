package net.sytes.canterosoft.pintureria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PintureriaApplication implements CommandLineRunner {
//public class PintureriaApplication {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(PintureriaApplication.class, args);
	}

	//Metodo para encriptar
	@Override
	public void run(String... args) throws Exception {
		String pass1 = "admin";
		String pass2 = "user";
		System.out.println(passwordEncoder.encode(pass1));
		System.out.println(passwordEncoder.encode(pass2));
	}
}
