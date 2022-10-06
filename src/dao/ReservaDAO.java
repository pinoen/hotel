package dao;

import model.Reserva;

import java.sql.*;

public class ReservaDAO {
    private Connection connection;

    public ReservaDAO(Connection connection){
        this.connection = connection;
    }

    public void guardar(Reserva reserva){
        try {
            String sql = "insert into reservas(fecha_entrada, fecha_salida, valor, forma_pago) values (?,?,?,?)";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                preparedStatement.setDate(1,reserva.getFecha_entrada());
                preparedStatement.setDate(2,reserva.getFecha_salida());
                preparedStatement.setString(3,reserva.getValor());
                preparedStatement.setString(4,reserva.getForma_pago());

                preparedStatement.executeUpdate();

                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                    while (resultSet.next()){
                        reserva.setId(resultSet.getInt(1));
                    }
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
