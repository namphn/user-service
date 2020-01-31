package web.service.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import web.service.user.service.JwtAthenticationFilter;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.UserService;

@EnableWebSecurity
public class WebSecrityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService

    @Bean
    public JwtAthenticationFilter
}
