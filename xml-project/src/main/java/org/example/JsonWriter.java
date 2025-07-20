import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class JsonWriter {

    public static void listToJson(List<Employee> list, String filename) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}