package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordGeneratorTest {
  @Test
    public void testGeneratePassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(8);
        assertEquals(8, password.length());
    }

}