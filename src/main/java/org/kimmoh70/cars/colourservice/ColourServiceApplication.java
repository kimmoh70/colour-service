package org.kimmoh70.cars.colourservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ColourServiceApplication {

    @Autowired
    private ColourRepository colourRepository;

    public static void main(String[] args) {
        SpringApplication.run(ColourServiceApplication.class, args);
    }


    @Configuration
    public class ColourServiceConfigurer extends RepositoryRestConfigurerAdapter {

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.getCorsRegistry()
                    .addMapping("/**")
                    .allowedOrigins("*")
                    .allowedHeaders("")
                    .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
        }
    }

}