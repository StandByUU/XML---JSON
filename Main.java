import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = XMLParser.parseXML("data.xml");
        JsonWriter.listToJson(employees, "data2.json");
        System.out.println("Файл data2.json успешно создан.");
    }
}