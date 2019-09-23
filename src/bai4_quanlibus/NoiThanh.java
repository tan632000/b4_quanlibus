/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_quanlibus;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NoiThanh extends ChuyenXe {
    public String SoTuyen;
    public double distances;

    public NoiThanh() {
    }

    public NoiThanh(String SoTuyen, double distances, String Idbus, String Namedriver, String Number, double Money) {
        super(Idbus, Namedriver, Number, Money);
        this.SoTuyen = SoTuyen;
        this.distances = distances;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public double getDistances() {
        return distances;
    }

    public void setSoTuyen(String SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public void setDistances(double distances) {
        this.distances = distances;
    }
    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap so tuyen:");
        this.SoTuyen = input.nextLine();
        System.out.println("Nhap so kms:");
        this.distances = input.nextDouble();
    }
    @Override
    public String toString(){
        return "Chuyen xe noi thanh:" +super.toString() + "\nSo tuyen:" + this.SoTuyen +"\nSo kms:" +this.distances +"\nDoanh thu:"+this.Money;    
    }
}
