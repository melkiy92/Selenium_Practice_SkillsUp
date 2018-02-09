package driver;

import java.util.*;

public class DriverConfig {
    public static final Map<String, String> config = createMap();

    public static Map<String, String> createMap() {
        Map<String, String> config = new HashMap<String, String>();
        config.put("name", "webdriver.gecko.driver");
        config.put("path", "C:\\Users\\777\\Desktop\\Selenium_Practice-master\\src\\main\\resources\\geckodriver.exe");
        return config;
    }
}

