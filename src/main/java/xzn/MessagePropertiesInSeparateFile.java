/*
 * Copyleft
 */

/*
 * Copyleft
 */
package xzn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "messagePropertiesInSeparateFile", locations = "classpath:separateProperties.yaml")
class MessagePropertiesInSeparateFile {

  private String property;

  public String getProperty() {
    return property;
  }

  public MessagePropertiesInSeparateFile setProperty(String property) {
    this.property = property;
    return this;
  }

}
