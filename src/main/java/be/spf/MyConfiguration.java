package be.spf;

import org.springframework.context.annotation.*;
import org.springframework.web.cors.*;
import org.springframework.boot.context.embedded.*;
import org.springframework.web.filter.*;

@Configuration
public class MyConfiguration {

	@Bean
	public FilterRegistrationBean corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://http://1611l22043a.smals-mvm.be:7000/");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}
}
