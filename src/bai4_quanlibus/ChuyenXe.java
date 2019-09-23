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
public class ChuyenXe {
    public String Idbus, Namedriver, Number;
    public double Money;

    public ChuyenXe() {
       
    }

    public ChuyenXe(String Idbus, String Namedriver, String Number, double Money) {
        this.Idbus = Idbus;
        this.Namedriver = Namedriver;
        this.Number = Number;
        this.Money = Money;
    }

    public String getIdbus() {
        return Idbus;
    }

    public String getNamedriver() {
        return Namedriver;
    }

    public String getNumber() {
        return Number;
    }

    public double getMoney() {
        return Money;
    }

    public void setIdbus(String Idbus) {
        this.Idbus = Idbus;
    }

    public void setNamedriver(String Namedriver) {
        this.Namedriver = Namedriver;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma so chuyen xe:");
        this.Idbus = input.nextLine();
        System.out.println("Nhap ten chu xe:");
        this.Namedriver = input.nextLine();
        System.out.println("Nhap so xe:");
        this.Number = input.nextLine();
        System.out.println("Nhap doanh thu:");
        this.Money = input.nextDouble();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "\nMa so chuyen: " + this.Idbus + "\nTen tai xe:" + this.Namedriver +"\nSo xe:" + this.Number;
    }
}
 