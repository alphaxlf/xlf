package po;


/**
 * 填空题
 */
public class Qlfb {
    private Integer fid;
    private String fquestion;
    private String fanswer;
    private String fteachername;

    private Integer kid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFquestion() {
        return fquestion;
    }

    public void setFquestion(String fquestion) {
        this.fquestion = fquestion;
    }

    public String getFanswer() {
        return fanswer;
    }

    public void setFanswer(String fanswer) {
        this.fanswer = fanswer;
    }

    public String getFteachername() {
        return fteachername;
    }

    public void setFteachername(String fteachername) {
        this.fteachername = fteachername;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Qlfb(Integer fid, String fquestion, String fanswer, String fteachername, Integer kid) {
        this.fid = fid;
        this.fquestion = fquestion;
        this.fanswer = fanswer;
        this.fteachername = fteachername;
        this.kid = kid;
    }

    public Qlfb(){

    }
}
