public class Vendedor {
    private int Documento;
    public  String Nombre, Apellido;
    public  String Celular;

    public Vendedor(int documento, String nombre, String apellido, String celular) {
        Documento = documento;
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public void AgregarVendedor(int documento, String nombre, String apellido, String celular){
        this.Documento = documento;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Celular = celular;

        System.out.print("Vendedor :" + nombre +" " + apellido +" agregado correctamente") ;
    }

}
