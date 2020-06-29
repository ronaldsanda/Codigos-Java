package vectorpersonas;
public class Persona {
   protected String nombre;
    protected String cedula;
    protected int edad;
    public Persona (){};//constructor
    public Persona (String n, String c, int e)
    {
    nombre=n;
    cedula=c;
    edad=e;
    }
    public void mostrar()
    {
    System.out.println("Nombre:    "+nombre+"    Cedula:    "+cedula+"    Edad:      "+edad);
    }
    public void setEdad(int ed){
    edad=ed;
    }
    public int getEdad(){
    return edad;
    }}


