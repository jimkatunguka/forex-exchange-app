package jim.katunguka.limitsservice;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
@Getter
@Setter
public class Configuration {
    private int minimum;
    private int maximum;
}
