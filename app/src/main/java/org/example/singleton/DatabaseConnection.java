package org.example.singleton;

public class DatabaseConnection {
    // Instancia privada y estática
    private static DatabaseConnection instance;
    
    // Constructor privado para evitar instanciación externa
    private DatabaseConnection() { }
    
    // Método de acceso para obtener la única instancia
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public String connect() {
        return "Connected to DB";
    }
}
