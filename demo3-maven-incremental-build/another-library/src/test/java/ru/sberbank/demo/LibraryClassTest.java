package ru.sberbank.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibraryClassTest {
    
    private final LibraryClass libraryClass = new LibraryClass();
    
    @Test
    void testDoWork() {
        Assertions.assertDoesNotThrow(libraryClass::doWork);
    }
}