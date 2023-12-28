package exam05;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws Exception {
//        File file = new File("d:/test1.txt");
//        file.createNewFile();

        File dir = new File("D:/folder/abc/dfg/eqw");
        if(!dir.exists()) {  // 파일 또는 디렉토리 존재 유무
            dir.mkdirs();   // 매 경로마다 디렉토리 없다면 생성
        }
        File file = new File("D:/test1.txt");
        //file.createNewFile();

        File file2 = File.createTempFile("tmp_", ".log", new File("D:/"));

        Thread.sleep(5000);

        file2.deleteOnExit();

    }
}
