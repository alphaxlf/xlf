package po;

/**
 * 判断题
 */
public class Qljq {
    private Integer lid;
    private String lquestion;
    private String lanswer;
    private String lanswerAnalysis;
    private String lteachername;

    private Integer kid;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLquestion() {
        return lquestion;
    }

    public void setLquestion(String lquestion) {
        this.lquestion = lquestion;
    }

    public String getLanswer() {
        return lanswer;
    }

    public void setLanswer(String lanswer) {
        this.lanswer = lanswer;
    }

    public String getLanswerAnalysis() {
        return lanswerAnalysis;
    }

    public void setLanswerAnalysis(String lanswerAnalysis) {
        this.lanswerAnalysis = lanswerAnalysis;
    }

    public String getLteachername() {
        return lteachername;
    }

    public void setLteachername(String lteachername) {
        this.lteachername = lteachername;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Qljq(Integer lid, String lquestion, String lanswer, String lanswerAnalysis, String lteachername, Integer kid) {
        this.lid = lid;
        this.lquestion = lquestion;
        this.lanswer = lanswer;
        this.lanswerAnalysis = lanswerAnalysis;
        this.lteachername = lteachername;
        this.kid = kid;
    }

    public Qljq(){

    }
}
