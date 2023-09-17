public class AparelhoTelefonico extends IPhone {

    public AparelhoTelefonico(String modelo, String imei, String nomeUsuario) {
        super(modelo, imei, nomeUsuario);
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
