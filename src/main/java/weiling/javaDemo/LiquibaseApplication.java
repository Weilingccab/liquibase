package weiling.javaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import weiling.javaDemo.springCloudStream.config.Sink;
import weiling.javaDemo.springCloudStream.config.Source;

@SpringBootApplication
@EnableBinding(value = {Source.class, Sink.class})
public class LiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseApplication.class, args);
	}

}
