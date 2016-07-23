/*
 * Copyleft
 */

package xzn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

  @Value("${name}")
  private String name;

  @Autowired
  private Prompt prompt;

  @RequestMapping("/")
  public String hi() {
    return prompt.getContent() + ": " + "I'm listening, " + name;
  }

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
