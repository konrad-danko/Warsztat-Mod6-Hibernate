package pl.coderslab.WarsztatMod6Hibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan("pl.coderslab")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "pl.coderslab.WarsztatMod6Hibernate.repository")
public class AppConfig {
}
