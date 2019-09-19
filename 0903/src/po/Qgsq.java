package po;

/**
 * 选择题
 */
public class Qgsq {
    private Integer gid;
    private String gquestion;
    private String a_options;
    private String b_options;
    private String c_options;
    private String d_options;
    private String ganswer;
    private String gteachername;

    private Integer kid;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGquestion() {
        return gquestion;
    }

    public void setGquestion(String gquestion) {
        this.gquestion = gquestion;
    }

    public String getA_options() {
        return a_options;
    }

    public void setA_options(String a_options) {
        this.a_options = a_options;
    }

    public String getB_options() {
        return b_options;
    }

    public void setB_options(String b_options) {
        this.b_options = b_options;
    }

    public String getC_options() {
        return c_options;
    }

    public void setC_options(String c_options) {
        this.c_options = c_options;
    }

    public String getD_options() {
        return d_options;
    }

    public void setD_options(String d_options) {
        this.d_options = d_options;
    }

    public String getGanswer() {
        return ganswer;
    }

    public void setGanswer(String ganswer) {
        this.ganswer = ganswer;
    }

    public String getGteachername() {
        return gteachername;
    }

    public void setGteachername(String gteachername) {
        this.gteachername = gteachername;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Qgsq(Integer gid, String gquestion, String a_options, String b_options, String c_options, String d_options, String ganswer, String gteachername, Integer kid) {
        this.gid = gid;
        this.gquestion = gquestion;
        this.a_options = a_options;
        this.b_options = b_options;
        this.c_options = c_options;
        this.d_options = d_options;
        this.ganswer = ganswer;
        this.gteachername = gteachername;
        this.kid = kid;
    }

    public Qgsq(){

    }
}
