package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Voiture voiture(String couleur, Float poids) {
        return new Voiture(couleur, poids);
    }

    @Bean
    public String couleur() {
        return "Grise";
    }

    @Bean
    public Float poids() {
        return 1550f;
    }
}
