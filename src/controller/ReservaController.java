package controller;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

import java.sql.Connection;

public class ReservaController {

    private ReservaDAO reservaDAO;

    public ReservaController(){
        Connection connection = new ConnectionFactory().recuperarConexion();
        this.reservaDAO = new ReservaDAO(connection);
    }
    public void guardar(Reserva reserva){
        this.reservaDAO.guardar(reserva);
    }
}
