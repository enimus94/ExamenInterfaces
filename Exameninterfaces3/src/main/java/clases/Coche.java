package clases;



import java.util.Date;

public class Coche {
public String matricula;
public String modelo;

public String cliente;

public String tarifa;

public int coste;

public Date fechaSalida;

public Date fechaEntrada;

    public Coche(String matricula, String modelo, String cliente, String tarifa, int coste, Date fechaSalida, Date fechaEntrada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cliente = cliente;
        this.tarifa = tarifa;
        this.coste = coste;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
}

