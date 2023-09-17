public class NavegadorInternet extends IPhone {
    private String navegador;
    private String paginaAtual;

    public NavegadorInternet(String modelo, String imei, String nomeUsuario, String navegador) {
        super(modelo, imei, nomeUsuario);
        this.navegador = navegador;
        this.paginaAtual = "";
    }

    public void exibirPagina(String url) {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Fechando página anterior: " + paginaAtual);
        }
        System.out.println("Exibindo página: " + url);
        this.paginaAtual = url;
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
}