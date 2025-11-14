package spring.ai.example.spring_ai_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiDemoApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner runner(ChatClient.Builder builder) {
	// return args -> {
	// ChatClient chatClient = builder.build();
	// String response = chatClient
	// .prompt("")
	// .call().content();
	// System.out.println(response);
	// };
	// }

}
