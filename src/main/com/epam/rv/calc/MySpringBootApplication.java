package com.epam.rv.calc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.epam.rv.calc.api.ContextConfiguration;

@SpringBootApplication
@Configuration
@Import(ContextConfiguration.class)
public class MySpringBootApplication {

}
