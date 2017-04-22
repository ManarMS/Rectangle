import java.util.Scanner;
public class E4_8
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double theLength = in.nextInt();
        System.out.print("Enter the width : ");
        double theWidth = in.nextInt();
        double Area = (theLength * theWidth);
        System.out.print("Area : ");
        System.out.println(Area);
        
        double Perimeter = ((theLength + theWidth)*2);
        System.out.print("Perimeter : ");
        System.out.println(Perimeter);
        
        double theDiagonal = Math.sqrt((theLength*theLength)+(theWidth*theWidth));
        System.out.print("theDiagonal : ");
        System.out.println(theDiagonal);
    }
}
        