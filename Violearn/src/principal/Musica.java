package principal;

public class Musica {
	private String autor;
    private String nomeMusica;

    public Musica(String autor, String nomeMusica) {
        this.autor = autor;
        this.nomeMusica = nomeMusica;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
}
