import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap side1");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap side2");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap side3");
        double side3 = scanner.nextDouble();

        try {
            if (( side1<side2+side3 && side2<side1+side3 && side3<side1+side2 )){
                Triangle  triangle = new Triangle(side1,side2,side3);
                System.out.println(triangle.toString());
            } else {
                Exception e;
                throw e = new Exception();
            }
        } catch (Exception e){
            System.out.println("Khong phai tam giac");

        }

    }
}
