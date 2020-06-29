package Huerta;
public class DatosProductos {
private String nombre,fechaSiembra,cantidadTerreno,fechaCosecha,produccion;
DatosProductos(String Nombre,String FechaSiem,String CantidadTerreno){
nombre=Nombre;
fechaSiembra=FechaSiem;
cantidadTerreno=CantidadTerreno;
}
void visualizar(){
System.out.println(""+nombre+" Fecha de siembra "+fechaSiembra+
          " Cantidad de terreno en hectareas "+cantidadTerreno);
}
void visualizarCompleto(){
System.out.println(""+nombre+" Fecha de siembra "+fechaSiembra+
" Cantidad de terreno en hectareas "+cantidadTerreno+" Fecha de cosecha "
         +fechaCosecha+" Cantidad de produccion en quintales "+produccion);
}
void visualizarProducto(){
System.out.println(""+nombre);
}
String getProducto(){
return nombre;
}
String getFechas(){
return "Fecha de siembra "+fechaSiembra+" Fecha de cosecha "+fechaCosecha;
}
String getTerreno(){
return cantidadTerreno;
}
String getProduccion(){
return produccion;
}
void setFechaC(String FechaC){
fechaCosecha=FechaC;
}
void setProduccion(String Produccion){
produccion=Produccion;
}
}
