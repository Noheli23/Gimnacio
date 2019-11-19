package modeloVO;

public class ClasesVO {

    private Integer codigo;
    private String clase;
    private String horario;
    private Integer instructor;

    public ClasesVO() {
   
    }

    public ClasesVO(Integer codigo, String clase, String horario, Integer instructor) {
        this.codigo = codigo;
        this.clase = clase;
        this.horario = horario;
        this.instructor = instructor;
    }


   

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getInstructor() {
        return instructor;
    }

    public void setInstructor(Integer instructor) {
        this.instructor = instructor;
    }

}
