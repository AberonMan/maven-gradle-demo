package ru.sberbank.demo;

import ru.sberbank.demo.utils.DemoFilesUtils;

public class Main {
    
    public static void main(String[] args) {
        // Line to remove for compilation
        System.out.println(DemoFilesUtils.loadFile("cat.txt"));
    }
}