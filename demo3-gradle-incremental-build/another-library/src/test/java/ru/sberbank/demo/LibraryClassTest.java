package ru.sberbank.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sberbank.demo.utils.LibraryClass;

class LibraryClassTest {
    
    private final LibraryClass libraryClass = new LibraryClass();
    
    @Test
    void testDoWork() {
        Assertions.assertDoesNotThrow(libraryClass::doWork);
    }
}