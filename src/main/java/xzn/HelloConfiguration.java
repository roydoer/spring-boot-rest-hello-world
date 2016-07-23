/*
 * Copyleft
 */
package xzn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

  @Bean
  public Prompt prompt(@Value("${prompt.content}") String promptMessage) {
    return new Prompt(promptMessage);
  }

}
