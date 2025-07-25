package br.com.quintinno.portariumapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(Application.class);

	private LocalDateTime dataBuild = LocalDateTime.now();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// TODO: Importar dados do arquivo de configuração
	public String api() {
		StringBuilder apiInfo = new StringBuilder()
				.append("\n\n")
				.append("Aplicação:  PortariumService \n")
				.append("Porta:      8765 \n")
				.append("Publicação: " + dataBuild.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n")
				.append("Ambiente:   Desenvolvimento \n");
		return apiInfo.toString();
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.api());
		log.info(api());
	}

}
