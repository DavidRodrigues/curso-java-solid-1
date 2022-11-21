package exercicio_solid_1.Service;

import exercicio_solid_1.Model.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueService {

    AlbumMusicaService albumService;
    BrinquedoService brinquedoService;
    FilmeService filmeService;
    JogoService jogoService;
    LivroService livroService;

    public EstoqueService() {
        this.albumService = new AlbumMusicaService();
        this.brinquedoService = new BrinquedoService();
        this.filmeService = new FilmeService();
        this.jogoService = new JogoService();
        this.livroService = new LivroService();
    }

    public Map<String, String> ListarEstoque() {
        Map<String, String> retorno = new HashMap<String, String>();

        retorno.putAll(albumService.BuscarEstoque());
        retorno.putAll(brinquedoService.BuscarEstoque());
        retorno.putAll(filmeService.BuscarEstoque());
        retorno.putAll(jogoService.BuscarEstoque());
        retorno.putAll(livroService.BuscarEstoque());

        return retorno;
    }
}
