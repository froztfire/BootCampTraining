package Week3.CSVDataProcessing;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SFTAcademyDataProcessorClass implements SFTAcademyDataProcessor {
    private SFTAcademyFileReader fileReader;
    public SFTAcademyDataProcessorClass(SFTAcademyFileReader fileReader) {
        this.fileReader = fileReader;
    }
    @Override
    public List<SFTEmployees> processSorter() throws IOException {
        List<String> employeeRows = fileReader.read();
        return employeeRows
                .stream()
                .map(stringRepresentingRow -> {
                    List<String> rowInListForm = Arrays.asList(stringRepresentingRow.split(","));
                    long id = Long.valueOf(rowInListForm.get(0));
                    String name = rowInListForm.get(1);
                    long age = Long.valueOf(rowInListForm.get(2));
                    Double salary = Double.valueOf(rowInListForm.get(3));
                    return new SFTEmployees(id, name, age, salary);
                }).sorted(Comparator.comparing(SFTEmployees::getSalary).reversed())
                .collect(Collectors.toList());
    }
    @Override
    public List<SFTEmployees> processNetSalary() throws IOException {
        List<String> employeeRows = fileReader.read();
        return employeeRows
                .stream()
                .map(stringRepresentingRow -> {
                    List<String> rowInListForm = Arrays.asList(stringRepresentingRow.split(","));
                    long id = Long.valueOf(rowInListForm.get(0));
                    String name = rowInListForm.get(1);
                    long age = Long.valueOf(rowInListForm.get(2));
                    Double netSalary = Double.valueOf(rowInListForm.get(3))-(Double.valueOf(rowInListForm.get(3)) * 0.12);
                    return new SFTEmployees(id, name, age, netSalary);
                }).collect(Collectors.toList());
    }
    @Override
    public List<SFTEmployees> processNameFilter() throws IOException {
        List<String> employeeRows = fileReader.read();
        return employeeRows
                .stream()
                .map(stringRepresentingRow -> {
                    List<String> rowInListForm = Arrays.asList(stringRepresentingRow.split(","));
                    long id = Long.valueOf(rowInListForm.get(0));
                    String name = rowInListForm.get(1);
                    long age = Long.valueOf(rowInListForm.get(2));
                    Double netSalary = Double.valueOf(rowInListForm.get(3));
                    return new SFTEmployees(id, name, age, netSalary);
                })
                .filter(emp -> emp.getName().equals("jerome"))
                .collect(Collectors.toList());
    }
}
