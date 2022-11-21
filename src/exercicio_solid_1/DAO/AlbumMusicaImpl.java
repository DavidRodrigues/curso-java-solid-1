package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.AlbumMusica;

public class AlbumMusicaImpl extends DaoGenericoImpl<AlbumMusica> {
    public AlbumMusicaImpl() {
        super(Database.Tables.getAlbumsDeMusica());
    }
}
