package Week3.CSVDataProcessing;

import Week3.CSVDataProcessing.CSVFileReader;
import Week3.CSVDataProcessing.SFTAcademyFileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    @Test
    @DisplayName("GIVEN datastore.csv, when SFTAcademyFileReader.read is called, then result should be in a list of string")
    public void readTestIfItReturnsData() throws IOException {

        //act
        SFTAcademyFileReader fileReader = new CSVFileReader();
        List<String> csvRows = fileReader.read();

        //assert
        long rowCount = csvRows.stream().count();
        int expectedRowCount = 4;
        assertEquals(expectedRowCount, rowCount);

    }

    @Test
    @DisplayName("GIVEN datastore.csv, first entry should be 1,jerome,34,100000")
    public void readTestIfItReturnsCorrectData() throws IOException {

        //act
        SFTAcademyFileReader fileReader = new CSVFileReader();
        List<String> csvRows = fileReader.read();

        //assert
        String jeromeRow = csvRows.get(0);
        assertEquals("1,jerome,34,100000", jeromeRow);
    }

    @Test
    @DisplayName("GIVEN datastore.csv, last entry should be 4,wayne,29,75000")
    public void readTestIfItReturnsCorrectDataForLastRow() throws IOException {

        //act
        SFTAcademyFileReader fileReader = new CSVFileReader();
        List<String> csvRows = fileReader.read();

        //assert
        String lastRow = csvRows.get(csvRows.size() - 1);
        assertEquals("4,wayne,29,75000", lastRow);
    }
}
