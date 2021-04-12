package Componentes;

import Consultas.Tabla.Consulta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Jtable {
    public void Table(JTable Table,int[] array,JPanel panel,String Identificador)
    {
        JScrollPane scrollPane = new JScrollPane(Table);
        DefaultTableModel Model = new DefaultTableModel();
        scrollPane.setBounds(array[0],array[1],array[2],array[3]);
        Table.setBounds(array[0],array[1],array[2],array[3]);
        ResultSet resultSet;
        Consulta consulta = new Consulta();
        Table.setModel(Model);
        Table.setAutoCreateColumnsFromModel(true);
        panel.add(scrollPane);
        if (Identificador.equals("Empleados"))
        {
            resultSet = Conexion.ConexionConsulta.getTabla("SELECT * FROM empleado");
            Model.addColumn("Curp");
            Model.addColumn("Nombre");
            Model.addColumn("Apellido Paterno");
            Model.addColumn("Apellido Materno");
            Model.addColumn("Calle");
            Model.addColumn("Ciudad");
            Model.addColumn("Codigo Postal");
            Model.addColumn("Estado");
            consulta.Consulta(resultSet,Model,"Empleados");
        }
        if (Identificador.equals("InformacionEmpleados"))
        {
            resultSet = Conexion.ConexionConsulta.getTabla
                    ("SELECT empleado.curp,empleado.nombreempleado,empleado.apellidopaterno,empleado.apellidomaterno, sucursal.nombreempresa , " +
                            "trabaja.salario FROM trabaja INNER JOIN sucursal ON trabaja.id = sucursal.id INNER JOIN empleado ON trabaja.curp = empleado.curp;");
            Model.addColumn("Curp");
            Model.addColumn("Nombre");
            Model.addColumn("Apellido Paterno");
            Model.addColumn("Apellido Materno");
            Model.addColumn("Nombre Empresa");
            Model.addColumn("Salario");
            consulta.Consulta(resultSet,Model,"InformacionEmpleados");
        }
        if (Identificador.equals("Jefe"))
        {
            resultSet = Conexion.ConexionConsulta.getTabla("SELECT * FROM jefe");
            Model.addColumn("Curp");
            Model.addColumn("Puesto");
            consulta.Consulta(resultSet,Model,"Jefe");
        }
        if (Identificador.equals("Sucursal"))
        {
            resultSet = Conexion.ConexionConsulta.getTabla("SELECT * FROM sucursal");
            Model.addColumn("Clave Empresa");
            Model.addColumn("Nombre Sucursal");
            Model.addColumn("Ciudad");
            consulta.Consulta(resultSet,Model,"Sucursal");
        }
        if (Identificador.equals("Trabaja"))
        {
            resultSet = Conexion.ConexionConsulta.getTabla("SELECT * FROM trabaja");
            Model.addColumn("Clave Empleado");
            Model.addColumn("Clave Empresa");
            Model.addColumn("Curp");
            Model.addColumn("Salario");
            consulta.Consulta(resultSet,Model,"Trabaja");
        }



    }
}
