package principal;

public class Cita {
    private int id;
    private String descripcion;
    private String factura; 
    private boolean tieneCobro;
    private double monto;
    

    public Cita(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.factura = null;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
    
    public boolean isTieneCobro() {
    return tieneCobro;
}

public void setTieneCobro(boolean tieneCobro) {
    this.tieneCobro = tieneCobro;
}

public double getMonto() {
    return monto;
}

public void setMonto(double monto) {
    this.monto = monto;
}


    @Override
public String toString() {
    return "Cita(" +
            "Cédula=" + id +
            ", descripción='" + descripcion + '\'' +
            (factura != null ? ", factura='" + factura + '\'' : "") +
            ", tieneCobro=" + tieneCobro +
            (tieneCobro ? ", monto=₡" + monto : "") +
            ')';
}

}