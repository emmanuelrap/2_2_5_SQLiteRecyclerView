package co.quindio.sena.ejemplosqlite.utilidades;


public class Utilidades {

    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID="clave";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_SUELDO="sueldo";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " +
            ""+TABLA_USUARIO+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_SUELDO+" TEXT)";


}
