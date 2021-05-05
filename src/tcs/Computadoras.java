package tcs;

public class Computadoras {
    private int idcomputadora;
    private String ram;
    private String procesador;
    private String discoduro;

    public Computadoras(int idcomputadora, String ram, String procesador, String discoduro) {
        this.idcomputadora = idcomputadora;
        this.ram = ram;
        this.procesador = procesador;
        this.discoduro = discoduro;
    }

    public Computadoras(){

    }

    public int getIdcomputadora() {
        return idcomputadora;
    }

    public void setIdcomputadora(int idcomputadora) {
        this.idcomputadora = idcomputadora;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    @Override
    public String toString() {
        return "Computadoras{" +
                "idcomputadora=" + idcomputadora +
                ", ram='" + ram + '\'' +
                ", procesador='" + procesador + '\'' +
                ", discoduro='" + discoduro + '\'' +
                '}';
    }
}
