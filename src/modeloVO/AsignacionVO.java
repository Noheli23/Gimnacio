package modeloVO;

public class AsignacionVO {
   Integer codigo;
   Integer  cliente;
   Integer clase;
   String fechaIn;
   String fechaFin;

    public AsignacionVO() {
    }

    public AsignacionVO(Integer codigo, Integer cliente, Integer clase, String fechaIn, String fechaFin) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.clase = clase;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
   
}
