package Consultas.Tabla;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Consulta {
    public void Consulta(ResultSet resultSet, DefaultTableModel Model, String Identificador)
    {
        try {
            while (resultSet.next()) {
                if (Identificador.equals("Empleados"))
                {
                    Model.addRow(new Object[]{
                            resultSet.getString("curp"), resultSet.getString("nombreempleado"),resultSet.getString("apellidopaterno"),resultSet.getString("apellidomaterno")
                            ,resultSet.getString("calle"),resultSet.getString("ciudad"),resultSet.getString("codigopostal"),resultSet.getString("estado")
                    });
                }
                if (Identificador.equals("InformacionEmpleados"))
                {
                    Model.addRow(new Object[]{
                            resultSet.getString("curp"), resultSet.getString("nombreempleado"),resultSet.getString("apellidopaterno"),resultSet.getString("apellidomaterno")
                            ,resultSet.getString("nombreempresa"),resultSet.getString("salario")
                    });
                }
                if (Identificador.equals("Jefe"))
                {
                    Model.addRow(new Object[]{
                            resultSet.getString("curp"), resultSet.getString("puesto")
                    });
                }
                if (Identificador.equals("Sucursal"))
                {
                    Model.addRow(new Object[]{
                            resultSet.getString("id"), resultSet.getString("nombreempresa"),resultSet.getString("ciudad")
                    });
                }
                if (Identificador.equals("Trabaja"))
                {
                    Model.addRow(new Object[]{
                            resultSet.getString("idtrabaja"), resultSet.getString("id"),resultSet.getString("curp"),
                            resultSet.getString("salario")
                    });
                }

            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }






    }
}
