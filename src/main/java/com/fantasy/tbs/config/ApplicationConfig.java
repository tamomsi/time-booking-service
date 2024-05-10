import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TimeBookMapper timeBookMapper() {
        return new TimeBookMapper();
    }
}
