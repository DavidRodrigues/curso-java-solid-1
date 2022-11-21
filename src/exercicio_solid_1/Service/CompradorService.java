package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.AlbumMusicaImpl;
import exercicio_solid_1.DAO.CompradorImpl;
import exercicio_solid_1.DAO.IDaoGenerico;
import exercicio_solid_1.Model.AlbumMusica;
import exercicio_solid_1.Model.Comprador;

import java.util.List;

public class CompradorService  implements ICrudCompradorService<Comprador> {

    private CompradorImpl dao = new CompradorImpl();

    @Override
    public void salvar(Comprador entity) {
        this.dao.salvar(entity);
    }

    @Override
    public void alterar(Comprador entity) {
        this.dao.alterar(entity);
    }

    @Override
    public Comprador buscarPorId(Integer id) {
        return this.dao.buscarPorId(id);
    }

    @Override
    public List<Comprador> buscarTodos() {
        return this.dao.buscarTodos();
    }

    @Override
    public void excluir(Integer id) {
        this.dao.excluir(id);
    }

}