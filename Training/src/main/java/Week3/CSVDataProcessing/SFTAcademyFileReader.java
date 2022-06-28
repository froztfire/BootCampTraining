package Week3.CSVDataProcessing;

import java.io.IOException;
import java.util.List;

public interface SFTAcademyFileReader {
    List<String> read() throws IOException;
}
