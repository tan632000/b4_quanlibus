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
public class Bai4_quanlibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        Scanner a = new Scanner(System.in);
        ListChuyenXe dscx = new ListChuyenXe();
        do{
            System.out.println("\n");
            System.out.println("\t1.Them chuyen xe noi thanh:");
            System.out.println("\t2.Them chuyen xe ngoai thanh:");
            System.out.println("\t3.Hien thi danh sach");
            System.out.println("\t4.Thoat and see you again");
            System.out.println("Moi ban nhap lua chon:");
            x = a.nextInt();
            switch(x){
                case 1: 
                    dscx.listcx(1);
                    break;
                case 2:
                    dscx.listcx(2);
                    break;
                case 3:
                    dscx.out();
                    break;
            }
        }while(x!=4);
        System.out.println("");
    }
    
}
