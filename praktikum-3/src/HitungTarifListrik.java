import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //kostanta tarif listrik per kWh
        final double tarif_450=500;
        final double tarif_900=1000;
        final double tarif_2200=1500;
        final double tarif_atas_2200=2000;
        //imput golongan daya
        System.out.println("masukkan golongan daya listrik: ");
        int daya = sc.nextInt();

        //imput pemakaian listrik
        System.out.println("jumlah pemakaian listrik(kWh):");
        double pemakaian= sc.nextDouble();

        //validasi pemakaian menggunakan operator logika
        if(pemakaian<0) {
            System.out.println("error");
            return;
        }
         double tarif =0;
        String golongan ="";
        //menentukan golongan daya dan tarif
        if(daya ==450) {
            golongan = "450 va";
            tarif = tarif_450;
        } else if (daya==900) {
            golongan = "900 va";
            tarif = tarif_900;

        }else if (daya==2200) {
            golongan = "di atas 2200 va";
            tarif = tarif_atas_2200;
        }else {
            System.out.println("error");
        }
        //rumus menghitung total tagihan
        double totaltagihan= pemakaian*tarif;

        //menampilkan hasil
        System.out.println("==tagihan listrik==");
        System.out.println("golongan daya: "+golongan);
        System.out.println("jumlah kWh: "+pemakaian);
        System.out.println("tarif per kWh: "+tarif);
        System.out.println("total tagihan: "+totaltagihan);
        }
    }

