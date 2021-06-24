import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int head;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        head=input.nextInt();

        if(head>=25) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        else  if(head>=15 && head<=25){
            System.out.println("Pikniğe Gidebilirsiniz");
        }
        else if(head>=10 && head<=15){
            System.out.println("Piknik ve Sinemaya Gidebilirsiniz");
        }
        else if(head>=5 && head<=10){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else System.out.println("Kayağa Gidebilirsiniz.");
    }
}
