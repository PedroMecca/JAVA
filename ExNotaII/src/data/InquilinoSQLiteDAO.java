package data;

import model.Inquilino;
import model.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InquilinoSQLiteDAO implements InquilinoDAO {
    @Override
    public void salvar(Inquilino inquilino) {
        String sql = "INSERT INTO inquilino(cpf,nome,idInquilino,rendaMensal) VALUES (?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1,inquilino.getCpf());
            stmt.setString(2,inquilino.getNome());
            stmt.setInt(3,inquilino.getIdInquilino());
            stmt.setDouble(4,inquilino.getRendaMensal());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void atualizar(Inquilino inquilino) {
        String sql = "UPDATE inquilino SET cpf=?,nome=?, rendaMensal=? WHERE idInquilino=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1,inquilino.getCpf());
            stmt.setString(2,inquilino.getNome());
            stmt.setDouble(3,inquilino.getRendaMensal());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void apagar(Inquilino inquilino) {
        String sql = "DELETE FROM inquilino WHERE idInquilino=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,inquilino.getIdInquilino());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public Inquilino buscar(int id) {
        String sql = "SELECT * FROM inquilino WHERE idInquilino=?";
        Inquilino i =null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                i = new Inquilino(rs.getString("cpf"),rs.getString("nome"),rs.getInt("idInquilino"),rs.getDouble("rendaMensal"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Inquilino> buscarTodos() {
        String sql="SELECT * FROM inquilino";
        List<Inquilino> listaInq = new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Inquilino i = new Inquilino(rs.getString("cpf"),rs.getString("nome"),rs.getInt("idInquilino"),rs.getDouble("rendaMensal"));
            }
        }catch (Exception e){e.printStackTrace();}
        return listaInq;
    }
}
