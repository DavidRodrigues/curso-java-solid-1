package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.AlbumMusicaImpl;
import exercicio_solid_1.Model.AlbumMusica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlbumMusicaService extends CrudService<AlbumMusica> implements IEstoqueService {
    public AlbumMusicaService() {
        super(new AlbumMusicaImpl());
    }
}
