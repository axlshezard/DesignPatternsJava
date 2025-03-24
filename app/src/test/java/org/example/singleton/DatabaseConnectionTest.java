package org.example.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {
    @Test
    void singletonReturnsSameInstance() {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        assertSame(db1, db2, "Las instancias deben ser la misma");
    }
    
    @Test
    void connectReturnsExpectedMessage() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        assertEquals("Connected to DB", db.connect());
    }
}
