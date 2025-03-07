package part1.chapter3.execute_around_pattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderV1 {

    private final String FILE_PATH = "src/part1/chapter3/execute_around_pattern/data.txt";

    public String processFile(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            return processor.process(br);
        }
    }
}