import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int gun, ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum tarihinizin ayını yazınız: ");
        ay = input.nextInt();

        System.out.print("Lütfen doğum tarihinizin gününü yazınız: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun < 21) {
                System.out.print("Oğlak burcusunuz");
            } else {
                System.out.print("Kova burcusunuz");
            }
        }
        if (ay == 2) {
            if (gun < 19) {
                System.out.print("Kova burcusunuz");
            } else {
                System.out.print("Balık burcusunuz");
            }
        }
        if (ay == 3) {
            if (gun < 21) {
                System.out.print("Balık burcusunuz");
            } else {
                System.out.print("Koç burcusunuz");
            }
        }
        if (ay == 4) {
            if (gun < 21) {
                System.out.print("Koç burcusunuz");
            } else {
                System.out.print("Boğa burcusunuz");
            }
        }
        if (ay == 5) {
            if (gun < 21) {
                System.out.print("Boğa burcusunuz");
            } else {
                System.out.print("İkizler burcusunuz");
            }
        }
        if (ay == 6) {
            if (gun < 22) {
                System.out.print("İkizler burcusunuz");
            } else {
                System.out.print("Yengeç burcusunuz");
            }
        }
        if (ay == 7) {
            if (gun < 22){
                System.out.print("Yengeç burcusunuz");
            } else {
                System.out.print("Aslan burcusunuz");
            }
        }
        if (ay == 8) {
            if (gun < 23){
                System.out.print("Aslan burcusunuz");
            } else {
                System.out.print("Başak burcusunuz");
            }
        }
        if (ay == 9){
            if (gun < 24){
                System.out.print("Başak burcusunuz");
            } else {
                System.out.print("Terazi burcusunuz");
            }
        }
        if (ay == 10){
            if (gun < 23){
                System.out.print("Terazi burcusunuz");
            } else {
                System.out.print("Akrep burcusunuz");
            }
        }
        if (ay == 11) {
            if (gun < 24){
                System.out.print("Akrep burcusunuz");
            } else {
                System.out.print("Yay burcusunuz");
            }
        }
        if (ay == 12) {
            if (gun < 23){
                System.out.print("Yay burcusunuz");
            } else {
                System.out.print("Oğlak burcusunuz");
            }
        }
    }
}