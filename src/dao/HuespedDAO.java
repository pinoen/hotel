package dao;

import model.Huesped;

import java.sql.*;

public class HuespedDAO {

    private Connection connection;

    public HuespedDAO(Connection connection){
        this.connection = connection;
    }

    public void registrar(Huesped huesped){
        try {
            String sql = "insert into huespedes(nombre, apellido, fecha_nacimiento, nacionalidad, telefono, idReserva) values (?,?,?,?,?,?)";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, huesped.getNombre());
                preparedStatement.setString(2, huesped.getApellido());
                preparedStatement.setDate(3,huesped.getFecha_nacimiento());
                preparedStatement.setString(4, huesped.getNacionalidad());
                preparedStatement.setString(5, huesped.getTelefono());
                preparedStatement.setInt(6,huesped.getIdReserva());

                preparedStatement.executeUpdate();

                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                    while (resultSet.next()){
                        huesped.setId(resultSet.getInt(1));
                    }
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
