package ru.sberbank.demo;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Files.readString(Path.of(Main.class.getResource("/cat.txt").toURI())));
    }
}