package configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static constants.Constants.PROPERTIES_FILE;

public class PropertiesReader {
    private final Properties properties;
    private static PropertiesReader instance;

    private PropertiesReader(String propertyFileName) {
        try {
            InputStream is = getClass().getClassLoader()
                    .getResourceAsStream(propertyFileName);
            this.properties = new Properties();
            this.properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertiesReader getInstance() {
        if (instance == null) {
            instance = new PropertiesReader(PROPERTIES_FILE);
        }
        return instance;
    }

    public String getBrowserName() {
        return this.properties.getProperty("browser");
    }
}
