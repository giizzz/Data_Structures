import java.util.Scanner;
public class MainStack {
    public static void main(String[] args) {
        Stack st1=new Stack();
        int sec=0,sayi;
        Scanner input =new Scanner(System.in);
        while(sec!=5) {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Stack boyutu");
            System.out.println("4.Stack i yazdır");
            System.out.println("5.Çıkış");
            System.out.print("Seçiniz->");
            sec=input.nextInt();
            switch (sec){
                case 1:
                    System.out.print("Push etmek istediğiniz sayıyı giriniz->");
                    sayi=input.nextInt();
                    st1.push(sayi);
                    break;
                case 2:
                    st1.pop();
                    break;
                case 3:
                    System.out.println("Stack boyutu->"+st1.size());
                    break;
                case 4:
                    st1.print();
                    break;

            }
        }
    }
}
