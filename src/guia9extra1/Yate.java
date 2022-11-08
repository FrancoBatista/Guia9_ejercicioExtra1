package guia9extra1;

import java.util.Date;

public class Yate extends BarcoMotor {

    private Integer numCamarotes;

    public Yate() {
    }

    public Yate(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer numCamarotes, Integer potencia) {
        super(potencia);
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer numCamarotes, Integer potencia, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
}
