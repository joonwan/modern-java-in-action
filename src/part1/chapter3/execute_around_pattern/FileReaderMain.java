package part1.chapter3.execute_around_pattern;

import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) throws IOException {
        FileReaderV1 fileReader = new FileReaderV1();
        System.out.println(fileReader.processFile((br) -> br.readLine() + " " + br.readLine()));
    }

}
