public class Aktoret {
    /** aktori ka nje emer te plote (emer mbiemer)
     * aktori ka nje rol
     * aktori ka nje moshe
     * konstroktor me/pa parametra
     * getters dhe setters
     * to string*/
    String emerIPlote;
    String roli;
    int mosha;

    public Aktoret() {
    }

    public Aktoret(String emerIPlote, String roli, int mosha) {
        this.emerIPlote = emerIPlote;
        this.roli = roli;
        this.mosha = mosha;
    }

    public String getEmerIPlote() {
        return emerIPlote;
    }

    public void setEmerIPlote(String emerIPlote) {
        this.emerIPlote = emerIPlote;
    }

    public String getRoli() {
        return roli;
    }

    public void setRoli(String roli) {
        this.roli = roli;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Aktoret{" +
                "emerIPlote='" + emerIPlote + '\'' +
                ", roli='" + roli + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}
