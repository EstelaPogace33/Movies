import java.util.List;

public class Filmat {
    /** 	 vitiIProdhimit psh 28022022;
     	     titulli;
     List<String> zhanerat;
     	String kohezgjatja psh "1:20:30";
     	List<Aktoret> aktoret;*/
    private List<Aktoret> aktoret;
    private List<String> zhanerat;
    private long vitiIprodhimit;
    private String kohezgjatja;

    public Filmat() {
    }

    public Filmat(List<Aktoret> aktoret, List<String> zhanerat, long vitiIprodhimit, String kohezgjatja) {
        this.aktoret = aktoret;
        this.zhanerat = zhanerat;
        this.vitiIprodhimit = vitiIprodhimit;
        this.kohezgjatja = kohezgjatja;
    }

    public List<Aktoret> getAktoret() {
        return aktoret;
    }

    public void setAktoret(List<Aktoret> aktoret) {
        this.aktoret = aktoret;
    }

    public List<String> getZhanerat() {
        return zhanerat;
    }

    public void setZhanerat(List<String> zhanerat) {
        this.zhanerat = zhanerat;
    }

    public long getVitiIprodhimit() {
        return vitiIprodhimit;
    }

    public void setVitiIprodhimit(long vitiIprodhimit) {
        this.vitiIprodhimit = vitiIprodhimit;
    }

    public String getKohezgjatja() {
        return kohezgjatja;
    }

    public void setKohezgjatja(String kohezgjatja) {
        this.kohezgjatja = kohezgjatja;
    }

    @Override
    public String toString() {
        return "Filmat{" +
                "aktoret=" + aktoret +
                ", zhanerat=" + zhanerat +
                ", vitiIprodhimit=" + vitiIprodhimit +
                ", kohezgjatja='" + kohezgjatja + '\'' +
                '}';
    }
}
