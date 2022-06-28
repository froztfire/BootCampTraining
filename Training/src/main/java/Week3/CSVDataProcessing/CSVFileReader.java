package Week3.CSVDataProcessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CSVFileReader implements SFTAcademyFileReader {
    @Override
    public List<String> read() throws IOException {

        Path csvPath = Paths.get("C:\\Users\\jerome.garcia\\BootCampTraining\\WrittingUnitTest\\UnitTest\\src\\main\\resources\\datastore.csv");

        List<String> csvRows = Files.readAllLines(csvPath);

        return csvRows.stream().skip(1).collect(Collectors.toList());
    }
}
