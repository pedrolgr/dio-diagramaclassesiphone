public class ReprodutorMusical extends IPhone {
    private String musica;

    public ReprodutorMusical(String modelo, String imei, String nomeUsuario) {
        super(modelo, imei, nomeUsuario);
        this.musica = "";
    }

    public void adicionarMusica(String musica) {
        this.musica = musica;
    }

    public void tocar() {
        if (!musica.isEmpty()) {
            System.out.println("Tocando: " + musica);
        } else {
            System.out.println("Nenhuma música selecionada. Adicione uma música.");
        }
    }

    public void pausar() {
        if (!musica.isEmpty()) {
            System.out.println("Música pausada: " + musica);
        } else {
            System.out.println("Nenhuma música selecionada para pausar.");
        }
    }

    public void selecionarMusica(String novaMusica) {
        this.musica = novaMusica;
        System.out.println("Música selecionada: " + novaMusica);
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
}
