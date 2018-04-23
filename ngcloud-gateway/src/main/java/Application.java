import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author heidsoft
 */
@SpringBootApplication
public class Application {
  public static void main(String[] args) {

    new SpringApplicationBuilder(Application.class)
            .web(true).run(args);

  }
}