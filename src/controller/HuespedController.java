package controller;

import dao.HuespedDAO;
import factory.ConnectionFactory;
import model.Huesped;

import java.sql.Connection;

public class HuespedController {

    private HuespedDAO huespedDAO;

    public HuespedController(){
        Connection connection = new ConnectionFactory().recuperarConexion();
        this.huespedDAO = new HuespedDAO(connection);
    }

    public void registrar(Huesped huesped){
        this.huespedDAO.registrar(huesped);
    }
}
