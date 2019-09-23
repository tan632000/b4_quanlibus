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
public class NgoaiThanh extends ChuyenXe {
    public String place;
    public int days;

    public NgoaiThanh(String place, int days, String Idbus, String Namedriver, String Number, double Money) {
        super(Idbus, Namedriver, Number, Money);
        this.place = place;
        this.days = days;
    }

    public NgoaiThanh() {
    }

    public String getPlace() {
        return place;
    }

    public int getDays() {
        return days;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Noi den:");
        this.place = input.nextLine();
        System.out.println("So ngay den:");
        this.days =  input.nextInt();
    }
    
    @Override
    public String toString(){
        return "Chuyen xe ngoai thanh " + super.toString() + "\nNoi den:" +this.place + "\nSo ngay den:" +this.days +"\nDoanh thu:"+this.Money;    
    }
}
