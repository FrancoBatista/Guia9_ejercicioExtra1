package guia9extra1;

import java.util.Date;

public class BarcoMotor extends Barco {

    private Integer potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(Integer potencia, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

}

