package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class Ex1Test {

    @TempDir
    private File tmpFile;

    @Test
    void test1() {
        System.out.println(tmpFile.getAbsolutePath());
    }

    @Test
    @Timeout(3)
    void test2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    @Test
    void test3() {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now();
        assertTrue(1==2, "다르다");
    }
}