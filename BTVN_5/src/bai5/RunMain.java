/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        LopHoc K = new LopHoc();
        K.Nhap();
        K.Xuat();
        Dem(K);
        System.out.println("=>SAU KHI DUOC SAP XEP:");
        Sap(K);
        K.Xuat();
    }
    
    private static void Dem(LopHoc K){
        int d = 0;
        for (SinhVien sv : K.getList()){
            if (sv.getKhoaHoc() == 14){
                d++;
            }
        }
        System.out.println("Có " + d + " SV khoá 14");
    }
    
    private static void Sap(LopHoc K){
        for (int i=0; i<K.getList().size() - 1; i++){
            for (int j=i+1; j<K.getList().size(); j++){
                if (K.getList().get(i).getKhoaHoc() > K.getList().get(j).getKhoaHoc()){
                    SinhVien tg = K.getList().get(i);
                    K.getList().set(i, K.getList().get(j));
                    K.getList().set(j, tg);
                }
            }
        }
    }
}
