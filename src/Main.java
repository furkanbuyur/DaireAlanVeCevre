import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double radius,area,perimeter,aArea;
        int a;

    Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını cm cinsinden giriniz : ");
        radius = inp.nextDouble();
        area = Math.PI*radius*radius;
        perimeter=Math.PI*2*radius;

        System.out.println("Dairenin Alanı : "+ area );
        System.out.println("Dairenin Çevresi : "+perimeter);
        System.out.print("a açısının ölçüsünü girin : ");
        a =  inp.nextInt();
                aArea = (Math.PI*(radius*radius)*a)/360;
        System.out.println("a Açısının Daire Diliminin Alanı : "+aArea);

        
    }
}