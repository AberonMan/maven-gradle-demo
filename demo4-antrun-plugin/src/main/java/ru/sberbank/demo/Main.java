package ru.sberbank.demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println(Files.readString(Path.of(Main.class.getResource("/cat.txt").toURI())));
    }
}