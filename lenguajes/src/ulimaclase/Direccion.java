package ulimaclase;

public class Direccion {
    private long cp;
    private String calle;
    private String municipio;

    public Direccion(long cp, String calle, String municipio) {
        this.cp = cp;
        this.calle = calle;
        this.municipio = municipio;
    }

    public Direccion() {
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
