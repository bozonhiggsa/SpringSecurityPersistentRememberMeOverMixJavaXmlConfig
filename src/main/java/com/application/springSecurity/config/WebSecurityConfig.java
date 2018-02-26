package com.application.springSecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Java configuration of a Spring Security context - import from XML
 * @author Ihor Savchenko
 * @version 1.0
 */
@EnableWebSecurity
@ImportResource("classpath:app-context.xml")
@ComponentScan("com.application.springSecurity")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

}