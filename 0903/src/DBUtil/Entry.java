package DBUtil;

import core.DBManager;
import po.Qgsq;
import po.Qlfb;
import po.Qljq;
import po.Qlsaq;
import service.paperService;

import java.sql.*;
import java.util.ArrayList;

import java.util.List;

public class Entry {
    public static void main(String[] args) {
        String qgsqSql = "select * from qgsq order by rand() limit ?";
        String qljqSql = "select * from qljq order by rand() limit ?";
        String qlfbSql = "select * from qlfb order by rand() limit ?";
        String qlsaqSql = "select * from qlsaq order by rand() limit ?";

        //随机5道判断题
        List<Qljq> qljqs = new paperService().getPaperInfo(qljqSql, Qljq.class, new Object[]{5});
        for (Qljq q : qljqs) {
            System.out.println(q.getLid() + q.getLanswer() + q.getLanswerAnalysis() + q.getLquestion() + q.getLteachername() + q.getKid());
        }

        //随机5道填空题
        List<Qlfb> qlfbs = new paperService().getPaperInfo(qlfbSql, Qlfb.class, new Object[]{5});
        for (Qlfb f : qlfbs) {
            System.out.println(f.getFid() +f.getFquestion() +f.getFanswer() + f.getFteachername() + f.getKid());
        }

        //随机5道简答题
        List<Qlsaq> qlsaqs = new paperService().getPaperInfo(qlsaqSql, Qlsaq.class, new Object[]{5});
        for (Qlsaq s : qlsaqs) {
            System.out.println(s.getAid()+s.getAanswer()+s.getAquestion()+s.getAteachername()+s.getKid());
        }
        //随机5道选择题
        List<Qgsq> qgsqs = new paperService().getPaperInfo(qgsqSql, Qgsq.class, new Object[]{5});
        for (Qgsq q : qgsqs) {
            System.out.println(q.getGid() + q.getA_options() + q.getB_options() + q.getC_options() + q.getD_options() + q.getGanswer()+q.getGquestion()+q.getGteachername()+q.getKid());
        }


    }

}
