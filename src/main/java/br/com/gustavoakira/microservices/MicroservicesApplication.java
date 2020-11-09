package br.com.gustavoakira.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude={SolrAutoConfiguration.class})
@EnableEurekaClient
public class MicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

}
