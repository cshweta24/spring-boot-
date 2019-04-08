package com.example.MongoImage;

import com.example.MongoImage.Property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class MongoImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoImageApplication.class, args);
	}

}
