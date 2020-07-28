package com.derek.kotlin.backend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Bean
    fun encoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }


    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
                .withUser("test1")
                .password(encoder().encode("pass1234"))
                .roles("ADMIN")
                .and()
                .withUser("user1")
                .password(encoder().encode("user1234"))
                .roles("USER")
    }

     @Throws(Exception::class)
     override fun configure(http: HttpSecurity) {
         http.httpBasic()
                 .and()
                 .authorizeRequests()
                 .antMatchers(HttpMethod.GET, "/").permitAll()
                 .antMatchers(HttpMethod.GET, "/api/**").hasRole("ADMIN")
                 .and()
                 .csrf().disable()
                 .formLogin().disable()
     }

}