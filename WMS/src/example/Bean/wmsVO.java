package example.Bean;

import java.util.List;


public class wmsVO {

    private MSTDTO mST;

    public static class MSTDTO {
        private int trnfconuser;
        private int trnfstaff;
        private String trnfplant;
        private String trnfcrtdept;
        private List<DTLDTO> dTL;
        private String trnfconflag;
        private String keyno;
        private String trnfdocno;
        private int trnfcrtid;
        private String center;
        private String trnfdocdt;
        private String source;
        private String trnfdept;
        private String service;
        private String trnfmemo;
        private String trnfcondate;
        private int user;

        public static class DTLDTO {
            private int trnfloutqty;
            private String trnflitem;
            private String trnflinbatch;
            private String cassteno;
            private int trnflinqty;
            private String trnfloutbatch;
            private String trnfloutplant;
            private String trnfldocno;
            private String idbengravedno;
            private String trnflinwarehouse;
            private int idbqty;
            private String trnflinplant;
            private String lasermark;
            private String idbbinlevel;
            private double bresitivity;
            private String trnfloutwarehouse;
            private int trnflseq;
            private String trnflinunit;
            private double sresitivity;
            private int idbcnt;
            private String trnfloutunit;
        }
    }
}
