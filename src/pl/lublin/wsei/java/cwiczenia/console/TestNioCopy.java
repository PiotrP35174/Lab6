package pl.lublin.wsei.java.cwiczenia.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {
    public  static  void  main(String[] args) throws IOException {
       // long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();
        File original =new File("sample_1920×1280.tiff");
        File copy = new File("img_copy2.tiff");
        Files.copy(original.toPath(), copy.toPath());
        //System.out.println("Czas kopiowania:" +(System.currentTimeMillis() - startTime)+ "ms" );
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime() - startTime) / 1000000+" ms");

    }
}
