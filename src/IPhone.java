public class IPhone {
    private String modelo;
    private String imei;
    private String nomeUsuario;

    public IPhone(String modelo, String imei, String nomeUsuario) {
        this.modelo = modelo;
        this.imei = imei;
        this.nomeUsuario = nomeUsuario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
