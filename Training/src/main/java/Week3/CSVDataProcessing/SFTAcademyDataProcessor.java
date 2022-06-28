package Week3.CSVDataProcessing;

import java.io.IOException;
import java.util.List;

public interface SFTAcademyDataProcessor {
    List<SFTEmployees> processSorter() throws IOException;
    List<SFTEmployees> processNetSalary() throws IOException;
    List<SFTEmployees> processNameFilter() throws IOException;
}
