package ru.itis.habitio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.habitio.config.ApplicationProperties;

@SpringBootApplication
@EntityScan(basePackages = "ru.itis.habitio.entity")
@EnableConfigurationProperties(ApplicationProperties.class)
public class HabitioBackendApplication {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }

    public static void main(String[] args) {
        SpringApplication.run(HabitioBackendApplication.class, args);
    }

}
