package model;
// Generated 01-Apr-2018 15:38:20 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Phieugui generated by hbm2java
 */
public class Phieugui  implements java.io.Serializable {


     private String idphieuGui;
     private String idsoTk;
     private float soTienGui;
     private Date ngayGui;
     private String nguoiGuiTien;

    public Phieugui() {
    }

    public Phieugui(String idphieuGui, String idsoTk, float soTienGui, Date ngayGui, String nguoiGuiTien) {
       this.idphieuGui = idphieuGui;
       this.idsoTk = idsoTk;
       this.soTienGui = soTienGui;
       this.ngayGui = ngayGui;
       this.nguoiGuiTien = nguoiGuiTien;
    }
   
    public String getIdphieuGui() {
        return this.idphieuGui;
    }
    
    public void setIdphieuGui(String idphieuGui) {
        this.idphieuGui = idphieuGui;
    }
    public String getIdsoTk() {
        return this.idsoTk;
    }
    
    public void setIdsoTk(String idsoTk) {
        this.idsoTk = idsoTk;
    }
    public float getSoTienGui() {
        return this.soTienGui;
    }
    
    public void setSoTienGui(float soTienGui) {
        this.soTienGui = soTienGui;
    }
    public Date getNgayGui() {
        return this.ngayGui;
    }
    
    public void setNgayGui(Date ngayGui) {
        this.ngayGui = ngayGui;
    }
    public String getNguoiGuiTien() {
        return this.nguoiGuiTien;
    }
    
    public void setNguoiGuiTien(String nguoiGuiTien) {
        this.nguoiGuiTien = nguoiGuiTien;
    }




}


