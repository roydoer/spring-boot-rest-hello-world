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
  private MessageProperties messageProperties;

  @Autowired
  private MessagePropertiesInSeparateFile messagePropertiesInSeparateFile;

  @Autowired
  private Prompt prompt;

  @RequestMapping("/")
  public String hi() {
    return prompt.getContent() + ": " + "I'm listening, " + name +
      ". Message properties: " + messageProperties.getProperty() +
      ". Message properties from separate file: " + messagePropertiesInSeparateFile.getProperty();
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

}
