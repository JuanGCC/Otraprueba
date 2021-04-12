package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionConsulta {
    public static ResultSet getTabla(String Consulta)
    {
        ResultSet datos= null;
        Statement statement;
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coppel",
                    "prueba","Coppel");
            statement = connection.createStatement();
            datos= statement.executeQuery(Consulta);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return datos;
    }
}
