package web.service.user.config;

import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import web.service.user.model.CustomAuthenticationManager;
import web.service.user.repository.UserRepository;
import web.service.user.repository.UserRepositoryCustom;
import web.service.user.repository.VerificationTokenRepository;
import web.service.user.repository.VerificationTokenRepositoryCustom;
import web.service.user.service.JwtAuthenticationEntryPoint;
import web.service.user.service.JwtAuthenticationFilter;
import web.service.user.service.UserService;

@EnableWebSecurity
public class WebSecrityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtAuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }



    @Bean
    public JwtAuthenticationEntryPoint getAuthenticationEntryPoint(){
        return new JwtAuthenticationEntryPoint();
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return new  CustomAuthenticationManager();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    MongoConfig mongoConfigBean(){
        return new MongoConfig();
    }

    @Bean
    UserRepository userRepositoryBean(){
        return new UserRepositoryCustom();
    }

    @Bean
    VerificationTokenRepository verificationTokenRepositoryBean(){
        return new VerificationTokenRepositoryCustom();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors()
                .and()
                .authorizeRequests()
                .antMatchers("/user/login","/user/verification", "/user/registrationConfirm").permitAll()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(authenticationEntryPoint)
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().formLogin().disable()
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);


    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/user/verification");
    }

    @Bean
    public SendGrid sendGridBean(){
        return new SendGrid("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");
    }
}
