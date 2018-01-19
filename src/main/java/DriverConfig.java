import java.util.*;

class DriverConfig {
    static final Map<String, String> config = createMap();

    private static Map<String, String> createMap() {
        Map<String, String> config = new HashMap<String, String>();
        config.put("name", "webdriver.gecko.driver");
        config.put("path", "C:\\Users\\777\\Desktop\\Selenium_Practice-master\\src\\main\\resources\\geckodriver.exe");
        return config;
    }
}

