package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class throwsKeyword {
    static void fileRead() throws IOException {
        FileReader file = new FileReader("Exception\\testfile.txt");
        BufferedReader fileinput = new BufferedReader(file);
        System.out.println(fileinput.readLine());
        fileinput.close();
    }
    public static void main(String[] args) {
        try {
            fileRead();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
