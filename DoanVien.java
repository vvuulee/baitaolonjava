/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author lecon
 */
public class DoanVien extends Student {

    private String ngayKetNapDoan;
    private boolean dongPhiDoan;

    public DoanVien() {
    }

    public DoanVien(String id, String name, String birdday, String classname, String ngayKetNapDoan) {
        super(id, name, birdday, classname);
        this.ngayKetNapDoan = ngayKetNapDoan;
        this.dongPhiDoan = false;
    }

    public String getNgayKetNapDoan() {
        return ngayKetNapDoan;
    }

    public void setNgayKetNapDoan(String ngayKetNapDoan) {
        this.ngayKetNapDoan = ngayKetNapDoan;
    }

    public boolean isDongPhiDoan() {
        return dongPhiDoan;
    }

    public void setDongPhiDoan(boolean dongPhiDoan) {
        this.dongPhiDoan = dongPhiDoan;
    }

    public String toString() {
        return "Doanvien :"
                + "ngay ket nap:" + ngayKetNapDoan
                + "dong phi doan" + dongPhiDoan
                + super.toString();

    }

}
