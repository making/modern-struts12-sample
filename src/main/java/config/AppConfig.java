package config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;

@Configuration
@ComponentScan(basePackages = { "app", "domain" }, scopeResolver = Jsr330ScopeMetadataResolver.class)
public class AppConfig {

	@Bean
	Mapper mapper() {
		return new DozerBeanMapper();
	}
}
