/*
 * Copyleft
 */
package xzn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "messageProperties")
class MessageProperties {

  private String property;

  public String getProperty() {
    return property;
  }

  public MessageProperties setProperty(String property) {
    this.property = property;
    return this;
  }

}
