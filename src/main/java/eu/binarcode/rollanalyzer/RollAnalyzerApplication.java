package eu.binarcode.rollanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "eu.binarcode.rollanalyzer")
public class RollAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollAnalyzerApplication.class, args);
	}

}
