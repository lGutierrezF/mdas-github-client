package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@ComponentScan(basePackages = {"mdas.github.client","springboot"})
@SpringBootApplication
public class GithubClientApplication/* implements CommandLineRunner*/ {


	public static void main(String[] args) throws IOException {
		SpringApplication.run(GithubClientApplication.class, args);
	}
}
