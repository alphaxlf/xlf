package po;

/**
 * 简答题
 */
public class Qlsaq {

    private Integer aid;
    private String aquestion;
    private String aanswer;
    private String ateachername;

    private Integer kid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAquestion() {
        return aquestion;
    }

    public void setAquestion(String aquestion) {
        this.aquestion = aquestion;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }

    public String getAteachername() {
        return ateachername;
    }

    public void setAteachername(String ateachername) {
        this.ateachername = ateachername;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Qlsaq(Integer aid, String aquestion, String aanswer, String ateachername, Integer kid) {
        this.aid = aid;
        this.aquestion = aquestion;
        this.aanswer = aanswer;
        this.ateachername = ateachername;
        this.kid = kid;
    }

    public Qlsaq(){

    }
}
