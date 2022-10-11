import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class properties {
    public static void main(String[] args) {

        try {
            properties properties = new properties();
            properties.parsingProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        InputStream ins= PropertiseDemo.class.getResourceAsStream("/db.properties");
    }

    private  void parsingProperties() throws IOException {
        Properties properties = new Properties();
        InputStream in = super.getClass().getClassLoader().getResourceAsStream("mycimConfig.properties");
        properties.load(in);
        String property = properties.getProperty("CONFIG.MERGECONFIG.TIMELIMITS");
        System.out.println(property);
    }
}
