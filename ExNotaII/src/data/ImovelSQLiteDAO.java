package data;

import model.Imovel;
import model.Proprietario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImovelSQLiteDAO implements ImovelDAO{
    @Override
    public void salvar(Imovel imovel) {
        String sql = "INSERT INTO imovel(idImovel,endereco,valorAluguel,proprietario) VALUES (?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,imovel.getIdImovel());
            stmt.setString(2, imovel.getEndereco());
            stmt.setDouble(3,imovel.getValorAluguel());
            stmt.setInt(4,imovel.getProprietario().getIdProp());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}

    }



    @Override
    public void atualizar(Imovel imovel) {
        String sql = "UPDATE imovel SET idImovel=?,endereco,valorAluguel,proprietario=? WHERE idImovel=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,imovel.getIdImovel());
            stmt.setString(2, imovel.getEndereco());
            stmt.setDouble(3,imovel.getValorAluguel());
            stmt.setInt(4,imovel.getProprietario().getIdProp());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Imovel imovel) {
        String sql = "DELETE FROM imovel WHERE idImovel=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, imovel.getIdImovel());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public Imovel buscar(int id) {
        String sql = "SELECT * FROM imovel WHERE idImovel=?";
        Imovel i=null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Proprietario p = new ProprietarioSQLiteDAO().buscar(rs.getInt("proprietario"));
                i = new Imovel(rs.getInt("idImovel"),rs.getString("endereco"),rs.getDouble("valorAluguel"),p);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Imovel> buscarTodos() {
        String sql = "SELECT * FROM imovel";
        List<Imovel> listaImov=new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Proprietario p = new ProprietarioSQLiteDAO().buscar(rs.getInt("proprietario"));
                Imovel i = new Imovel(rs.getInt("idImovel"),rs.getString("endereco"),rs.getDouble("valorAluguel"),p);
                listaImov.add(i);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaImov;
    }
}
