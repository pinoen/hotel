package model;

import java.sql.Date;

public class Reserva {

    private int id;
    private Date fecha_entrada;
    private Date fecha_salida;
    private String valor;
    private String forma_pago;

    public Reserva(Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.valor = valor;
        this.forma_pago = forma_pago;
    }

    public Reserva(int id, Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
        this.id = id;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.valor = valor;
        this.forma_pago = forma_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public String getValor() {
        return valor;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }
}
