import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double width = 0;
        double length = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.printf("enter the width of the rectangle");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            System.out.printf("enter the length of the rectangle");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                double area = length * width;
                double perimeter = 2*length + 2*width;
                double diagonal = (length * length)+ (width *width);
                double diagonalFinal = Math.sqrt(diagonal);
                System.out.println("the perimeter is "+perimeter);
                System.out.println("the area is "+area );
                System.out.println("the diagonal is "+diagonalFinal);

            }  else {
                trash = in.nextLine();
                System.out.println("you did not enter a valid number for the Length "+ trash);}



        }
        else {
            trash = in.nextLine();
            System.out.println("you did not enter a valid number for the width the number you entered was "+ trash);
        }
    }
}

