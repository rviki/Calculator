package com.epam.rv.calc.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@Import({CalcController.class})
public class ContextConfiguration {

}
