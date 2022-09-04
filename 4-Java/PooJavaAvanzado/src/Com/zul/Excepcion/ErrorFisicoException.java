package Com.zul.Excepcion;

public class ErrorFisicoException extends Exception{
    public ErrorFisicoException(Exception ex) {
        super("\t\t\t <-- Ocurrio un Error Físico --> ", ex);
    }
}
