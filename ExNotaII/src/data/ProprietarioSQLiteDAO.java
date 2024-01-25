package data;

import model.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProprietarioSQLiteDAO implements ProprietarioDAO{

    @Override
    public void salvar(Proprietario proprietario) {
        String sql = "INSERT INTO proprietario(idProp, banco, conta,nome,cpf) VALUES (?,?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,proprietario.getIdProp());
            stmt.setString(2, proprietario.getBanco());
            stmt.setString(3, proprietario.getConta());
            stmt.setString(4, proprietario.getNome());
            stmt.setString(5, proprietario.getCpf());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void atualizar(Proprietario proprietario) {
        String sql = "UPDATE proprietario SET banco=?,conta=?,nome=?,cpf=? WHERE idProp=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1, proprietario.getBanco());
            stmt.setString(2, proprietario.getConta());
            stmt.setString(3, proprietario.getNome());
            stmt.setString(4, proprietario.getCpf());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void apagar(Proprietario proprietario) {
        String sql = "DELETE FROM proprietario WHERE idProp=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,proprietario.getIdProp());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public Proprietario buscar(int id) {
        String sql = "SELECT * FROM proprietario WHERE idProp=?";
        Proprietario p=null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               p = new Proprietario(rs.getString("cpf")
                       ,rs.getString("nome")
                       ,rs.getInt("idProp")
                       ,rs.getString("banco")
                       ,rs.getString("conta"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;

    }

    @Override
    public List<Proprietario> buscarTodos() {
        String sql="SELECT * FROM proprietario";
        List<Proprietario> listaProp = new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Proprietario p = new Proprietario(rs.getString("cpf")
                        ,rs.getString("nome")
                        ,rs.getInt("idProp")
                        ,rs.getString("banco")
                        ,rs.getString("conta"));
                listaProp.add(p);
            }
        }catch (Exception e){e.printStackTrace();}
        return listaProp;
    }
}
