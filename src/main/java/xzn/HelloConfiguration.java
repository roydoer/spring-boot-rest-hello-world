/*
 * Copyleft
 */
package xzn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfiguration {

  @Bean
  @Profile("prod")
  public Prompt prompt(@Value("${prompt.content}") String promptMessage) {
    return new Prompt(promptMessage);
  }

  @Bean
  @Profile("dev")
  public Prompt promptDev() {
    return new Prompt(">>DEV>>");
  }

}
