package guia9extra1;

import java.util.Date;
import java.util.Scanner;

public class Alquiler {

    private String nombre;

    private Integer DNI;

    private Date alquilerAlta;

    private Date alquilerBaja;

    private EnumAmarre amarre;

    private Barco barcoOcupado;

    public void calcularAlquiler() {
       Integer diasTotales = Alquiler.diferenciaDias(this.alquilerAlta, this.alquilerBaja);
        System.out.println("dias totales"+diasTotales);
        Integer modulo = diasTotales * 10 * this.barcoOcupado.getEslora();
        System.out.println("modulo"+modulo);
        if (this.barcoOcupado instanceof Yate) {
            Yate y1 = (Yate) this.barcoOcupado;
           modulo=modulo+y1.getPotencia()+y1.getNumCamarotes();
            System.out.println("modulo yate"+modulo);
            
        }else if (this.barcoOcupado instanceof Velero) {
            Velero v1 = (Velero) this.barcoOcupado;
            modulo=modulo+v1.getNumMastiles();
            
        }else if (this.barcoOcupado instanceof BarcoMotor) {
            BarcoMotor b1 = (BarcoMotor) this.barcoOcupado;
           modulo=modulo+b1.getPotencia();
            
        }
        System.out.println("el precio del alquiler es: $"+modulo);

    }

    public void crearAlquiler(Barco b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        this.nombre = sc.next();
        System.out.println("ingrese su dni");
        this.DNI = sc.nextInt();
        System.out.println("ingrese la fecha de inicio del alquiler");
        System.out.println("ingrese el dia");
        Integer dia = sc.nextInt();
        System.out.println("ingrese el mes");
        Integer mes = sc.nextInt();
        System.out.println("ingrese el año");
        Integer anio = sc.nextInt();
        this.alquilerAlta = new Date(anio, mes, dia);
        System.out.println();
        System.out.println("ingrese la fecha de finalizcion del alquiler");
        System.out.println("ingrese el dia");
        dia = sc.nextInt();
        System.out.println("ingrese el mes");
        mes = sc.nextInt();
        this.alquilerBaja = new Date(anio, mes,dia);
        this.setBarcoOcupado(b);
        System.out.println("ingrese el tipo de fondeo");
        System.out.println("1-Baltico");
        System.out.println("2-Mediterraneo");
        System.out.println("3-ancla");
        Integer op = sc.nextInt();
        boolean validar = false;
        do {

            switch (op) {

                case 1:
                    this.setAmarre(EnumAmarre.BALTICO);
                    validar = true;
                    break;
                case 2:
                    this.setAmarre(EnumAmarre.MEDITERRANEO);
                    validar = true;
                    break;
                case 3:
                    this.setAmarre(EnumAmarre.ANCLA);
                    validar = true;
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (validar == false);
    }

    
    
    
    
    public static int diferenciaDias(Date d1, Date d2) {
        int daysdiff = 0;
        int diasDiferencia = 0;
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000) + 1;
        daysdiff = (int) diffDays;
        diasDiferencia = daysdiff;
        return diasDiferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getAlquilerAlta() {
        return alquilerAlta;
    }

    public void setAlquilerAlta(Date alquilerAlta) {
        this.alquilerAlta = alquilerAlta;
    }

    public Date getAlquilerBaja() {
        return alquilerBaja;
    }

    public void setAlquilerBaja(Date alquilerBaja) {
        this.alquilerBaja = alquilerBaja;
    }

    public EnumAmarre getAmarre() {
        return amarre;
    }

    public void setAmarre(EnumAmarre amarre) {
        this.amarre = amarre;
    }

    public Barco getBarcoOcupado() {
        return barcoOcupado;
    }

    public void setBarcoOcupado(Barco barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }

}
