package edu.bsu.cs222;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslationExceptionTest {

    @Test
    public void testTranslationExceptionMessage() {
        String errorMessage = "Test error has occurred";
        TranslationException exception = new TranslationException(errorMessage);
        String exceptionMessage = exception.getMessage();
        assertEquals(errorMessage, exceptionMessage);
    }
}
