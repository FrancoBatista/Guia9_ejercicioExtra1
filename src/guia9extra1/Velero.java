package guia9extra1;

import java.util.Date;

public class Velero extends Barco {

    private Integer numMastiles;

    public Velero(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(Integer numMastiles, Integer matricula, Integer eslora, Date anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }
    
}
