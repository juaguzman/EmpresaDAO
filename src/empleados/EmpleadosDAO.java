package empleados;


import empleadosdao.clases.Empleado;
import empleadosdao.datos.*;
import java.sql.Array;
import static java.util.Collections.list;
import java.util.List;


public class EmpleadosDAO 
{
     EmpleadoDAO e = new EmpleadoDAO();
    
    public EmpleadosDAO()
    {
        
        
    }
    public List listar()
{       
        
        Empleado empleado = null;
        List empleados = e.obtenerEmpleados();
        for(int i =0;i<empleados.size();i++)
        {
            empleado = (Empleado) empleados.get(i);           
            System.out.println("Nombre: "+empleado.getNombre()+ " Edad: "+empleado.getEdad());
        } 
        
        return empleados;
}
    public void agregarEmpleado(String nom, int edad)
    {
        Empleado miemple = new Empleado();
        miemple.setEdad(edad);
        miemple.setNombre(nom);
        e.agregarEmpleado(miemple);
    }
    
    public void eliminar(int id)
    {
       
        e.eliminarEmpleado(id);
    }

    public static void main(String[] args)
    {
        interfaz f = new interfaz();
        EmpleadoDAO e = new EmpleadoDAO();
        f.setVisible(true);
        f.mostrarDatos();
        
        
        Empleado empleado = null;
        List empleados = e.obtenerEmpleados();
        for(int i =0;i<empleados.size();i++)
        {
            empleado = (Empleado) empleados.get(i);
            System.out.println("Nombre: "+empleado.getNombre()+ " Edad: "+empleado.getEdad());
        }
    }
    
}
