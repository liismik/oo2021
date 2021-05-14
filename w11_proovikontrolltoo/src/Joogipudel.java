public class Joogipudel {

    private String pudelitüüp;
    private int maht;
    private int mass;
    private Double taaraMaksumus;
    private Jook jook;

    public Joogipudel(String pudelitüüp, int maht, int mass, Double taaraMaksumus) {
        this.pudelitüüp = pudelitüüp;
        this.maht = maht;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
    }

    public Double pudelimassJoogiga() {
        Double result = Double.valueOf(mass);
        if (jook != null) {
            // Joogi kaalu arvutamine
            result += (jook.erikaal * 100) + maht;
        }
        return result;
    }

    public Jook getJook() {
        return jook;
    }

    public void setJook(Jook uusJook) {
        this.jook = uusJook;
    }
}
