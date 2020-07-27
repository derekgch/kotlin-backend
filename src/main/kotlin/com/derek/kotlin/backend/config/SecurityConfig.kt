package com.derek.kotlin.backend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
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
                .roles("manager")
    }

    // @Throws(Exception::class)
    // override fun configure(http: HttpSecurity) {
    //     http.httpBasic()
    //             .and()
    //             .authorizeRequests()
    //             .antMatchers(HttpMethod.GET, "/*").hasRole("manager")
    //             .and()
    //             .csrf().disable()
    //             .formLogin().disable()
    // }

}