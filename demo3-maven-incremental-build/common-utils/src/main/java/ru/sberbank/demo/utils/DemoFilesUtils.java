package ru.sberbank.demo.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class DemoFilesUtils {
    
    private DemoFilesUtils() {
        throw new IllegalStateException("Can't create DemoFilesUtils!");
    }
    
    public static String loadFile(String fileName) {
//        System.out.println("Loading from  file: " + fileName);
        
        try {
            return Files.readString(Path.of(DemoFilesUtils.class.getResource("/" + fileName).toURI()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
