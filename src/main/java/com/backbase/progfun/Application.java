package com.backbase.progfun;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static org.slf4j.LoggerFactory.getLogger;

@EnableAutoConfiguration
@ComponentScan
public class Application {

    private static final Logger LOGGER = getLogger(Application.class);

    public static void main(String[] args) throws Throwable {

        // port configurations for heroku
        String port = System.getenv("PORT");
        if (port != null && !port.isEmpty()) {
            LOGGER.info("Running on port {}", port);
            System.setProperty("server.port", port);
        }


        SpringApplication.run(Application.class, args);
    }

}