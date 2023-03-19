import java.util.Scanner;
public class  weatheroffer {

    public static void main(String[] args) {
        int tempature;
        System.out.println("please enter tempature:");
        Scanner input= new Scanner(System.in);
        tempature = input.nextInt();

        if (-5<tempature && tempature<=5){
            System.out.println("you can go sking");

        }else if (5<tempature && tempature<=25) {

            if (15<tempature && tempature<=25){
                System.out.println("you may go picnic");
            }else if (10 <= tempature && tempature <= 15) {
                System.out.println("you may go cinema or picnic");
            }else
                System.out.println("you may go cinema");

        }else if(tempature>25){
            System.out.println("you may go swimming");
        }
    }
}