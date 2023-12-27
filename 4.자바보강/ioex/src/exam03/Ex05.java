package exam03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis)) {

            boolean result = dis.readBoolean();
            int num = dis.readInt();
            String str = dis.readUTF();
                    // 입력한 순서대로 읽지 않으면 오류가 나거나 데이터가 깨져 나온다.
                    // 동일한 자료형을 사용하는 것이 권장한다.

            System.out.printf("result=%s, num=%d, str=%s%n", result, num, str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
