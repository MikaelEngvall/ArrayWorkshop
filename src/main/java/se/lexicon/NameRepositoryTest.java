package se.lexicon;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class NameRepositoryTest {
    private NameRepository nameRepository;

    @BeforeEach
    public void setUp() {
        nameRepository = new NameRepository();
    }
    @Test
    public void testFind() {
        String result = nameRepository.find("Erik Svensson");
        Assertions.assertEquals("Erik Svensson", result);
    }
    @Test
    public void testAdd() {
        boolean result = nameRepository.add("Erik Svensson");
        Assertions.assertEquals(false, result);
    }
}


