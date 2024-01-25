package data;

import model.Aluguel;
import model.Imovel;

import java.util.List;

public interface AluguelDAO extends DAO<Aluguel> {
    List<Aluguel> buscarAluguelPorImovel(Imovel imovel);
}
