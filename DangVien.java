/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import javax.bind.annotationXmlElement;

/**
 *
 * @author lecon
 */
public class DangVien extends DoanVien {

    private String ngayKetNapDang;
    private boolean dongPhiDang;

    public DangVien() {
    }

    public DangVien(String id, String name, String birdday, String classnameString, String ngayKetNapDoanString, String ngayKetNapdang) {
        super(id, name, birdday, name, ngayKetNapdang);
        this.ngayKetNapDang = ngayKetNapDang;
        this.dongPhiDang = false;

    }

    public String getNgayKetNapDang() {
        return ngayKetNapDang;
    }

    public void setNgayKetNapDang(String ngayKetNapDang) {
        this.ngayKetNapDang = ngayKetNapDang;
    }

    public boolean isDongPhiDang() {
        return dongPhiDang;
    }

    public void setDongPhiDang(boolean dongPhiDang) {
        this.dongPhiDang = dongPhiDang;
    }

    @Override
    public String toString() {
        return "DangVien{" + "ngayKetNapDang=" + ngayKetNapDang + ", dongPhiDang=" + dongPhiDang + '}' + super.toString();
    }

}
