package data;

import model.Aluguel;
import model.Imovel;
import model.Inquilino;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AluguelSQLiteDAO implements AluguelDAO{
    @Override
    public void salvar(Aluguel aluguel) {
        String sql = "INSERT INTO aluguel(idAluguel,inicioContrato,fimContrato,inquilino,imovel) VALUES (?,?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,aluguel.getIdAluguel());
            stmt.setString(2, aluguel.getInicioContrato());
            stmt.setString(3, aluguel.getFimContrato());
            stmt.setInt(4,aluguel.getInquilino().getIdInquilino());
            stmt.setInt(5,aluguel.getImovel().getIdImovel());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public List<Aluguel> buscarAluguelPorImovel(Imovel imovel){
        String sql = "SELECT * FROM aluguel WHERE imovel=?";
        List<Aluguel> listaAluguel=new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,imovel.getIdImovel());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Inquilino inquilino = new InquilinoSQLiteDAO().buscar(rs.getInt("inquilino"));

                Aluguel aluguel = new Aluguel(rs.getInt("idAluguel"),
                                        rs.getString("inicioContrato"),
                                        rs.getString("fimContrato"),
                        inquilino,
                        imovel);
                listaAluguel.add(aluguel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAluguel;
    }

    @Override
    public void atualizar(Aluguel aluguel) {
        String sql = "UPDATE aluguel SET inicioContrato=?,fimContrato=?,inquilino=?,imovel=? WHERE idAluguel=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setString(1, aluguel.getInicioContrato());
            stmt.setString(2, aluguel.getFimContrato());
            stmt.setInt(3, aluguel.getInquilino().getIdInquilino());
            stmt.setInt(4, aluguel.getImovel().getIdImovel());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void apagar(Aluguel aluguel) {
        String sql = "DELETE FROM aluguel WHERE idAluguel=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, aluguel.getIdAluguel());
            stmt.executeUpdate();
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public Aluguel buscar(int id) {
        String sql = "SELECT * FROM aluguel WHERE id=?";
        Aluguel a = null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Inquilino inquilino = new InquilinoSQLiteDAO().buscar(rs.getInt("inquilino"));
                Imovel imovel = new ImovelSQLiteDAO().buscar(rs.getInt("imovel"));
                a = new Aluguel(rs.getInt("idAluguel"),rs.getString("inicioContrato"),rs.getString("fimContrato"),inquilino,imovel);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return a;
    }

    @Override
    public List<Aluguel> buscarTodos() {
        String sql = "SELECT * FROM aluguel";
        List<Aluguel> listaAluguel=new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Inquilino inquilino = new InquilinoSQLiteDAO().buscar(rs.getInt("inquilino"));
                Imovel imovel = new ImovelSQLiteDAO().buscar(rs.getInt("imovel"));
                Aluguel a = new Aluguel(rs.getInt("idAluguel"),rs.getString("inicioContrato"),rs.getString("fimContrato"),inquilino,imovel);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAluguel;
    }
}
