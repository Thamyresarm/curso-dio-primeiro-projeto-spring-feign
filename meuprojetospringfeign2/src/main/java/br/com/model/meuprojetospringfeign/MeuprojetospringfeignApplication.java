package br.com.model.meuprojetospringfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MeuprojetospringfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuprojetospringfeignApplication.class, args);
	}

}
