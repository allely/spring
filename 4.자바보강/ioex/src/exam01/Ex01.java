package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = 0;    // 1바이트 읽기

            while ((ch = fis.read()) != -1) {
                System.out.println(ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
