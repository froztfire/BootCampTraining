package com.bootcamp.w6.miniProj.RestAPIminiProj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "resource_id";
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
        http
				.headers()
				.frameOptions()
				.disable()
				.disable()
                .authorizeRequests()
				.antMatchers(HttpMethod.POST, "/users/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.PUT, "/users/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.DELETE, "/users/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.GET, "/users/**").access("hasAnyRole('ADMIN','USER')")
				.antMatchers(HttpMethod.POST, "/employees/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.PUT, "/employees/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.DELETE, "/employees/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.GET, "/employees/**").access("hasAnyRole('ADMIN','USER')")
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}
}