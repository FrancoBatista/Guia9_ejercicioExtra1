package guia9extra1;

public class GUIA9EXTRA1 {

    public static void main(String[] args) {
    Alquiler a1=new Alquiler();
    AgenciaBarco ag1=new AgenciaBarco();
    ag1.agregarBarco();
    System.out.println("elija un barco");
    a1.crearAlquiler(ag1.buscarBarco());
    a1.calcularAlquiler();
    }
}
