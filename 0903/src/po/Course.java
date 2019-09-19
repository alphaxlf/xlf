package po;

public class Course {
    private int kid; //表ID
    private String kname;//课程名称

    private  String kdes;//描述

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public String getKdes() {
        return kdes;
    }

    public void setKdes(String kdes) {
        this.kdes = kdes;
    }
}
