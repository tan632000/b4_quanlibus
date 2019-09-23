/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_quanlibus;

/**
 *
 * @author Admin
 */
public class ListChuyenXe {
    public ChuyenXe[] CXe = new ChuyenXe[100];
    public int countCX;
    public double sum1=0,sum2=0;
    public void ListCX(){
        countCX = 0;
        for(int i=0; i<10; i++)
        {
            CXe[i] = new ChuyenXe();
        }
    } 
    public void listcx(int temp){
        if(countCX > 10){
            System.err.println("Khong the them du lieu");
        }else{
            if(temp==1){
                CXe[countCX] = new NoiThanh();
                NoiThanh nt = new NoiThanh();
                nt.inputInfo();
                CXe[countCX] = nt;
                sum1+=nt.getMoney();
            }
            else{
                CXe[countCX] = new NgoaiThanh();
                NgoaiThanh NT = new NgoaiThanh();
                NT.inputInfo();
                CXe[countCX] = NT;
                sum2+=NT.getMoney();
            }
            countCX++;
        }
    }
    
    public void out(){
        for(int i=0;i<countCX;i++){
            System.out.println(CXe[i].toString());
        }
        System.out.println("-----------DOANH THU-----------");
        System.out.println("| Chuyen xe noi thanh: "  + sum1 + "|");
        System.out.println("| Chuyen xe ngoai thanh: " + sum2 + "|");
        System.out.println("-----------Bye----------");
    }
}
