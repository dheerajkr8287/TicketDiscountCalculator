import java.util.Scanner;

public class TicketDiscountcalulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("welcome to Ticket discount center calculator");
        //age
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        //gender
        System.out.println("enter your gender(M/F):");
        /*next() method of the Scanner class is used to read the user's input as a string. Then, charAt(0) is applied to get the first character of that string, which represents the user's gender.*/
        char gender=sc.next().charAt(0);
        

        //destination
        /*
         * The use of nextLine() after reading the gender is to consume the newline character left in the input buffer by the previous next() or nextInt() calls. When you use next() or nextInt(), they read only the input up to the next whitespace character (like space or newline) and leave the newline character in the buffer.

In your case, after reading the gender using next().charAt(0), there's a newline character still in the buffer. When you later use nextLine() to read the destination, it consumes that newline character, resulting in unexpected behavior. It may appear as if the nextLine() for the destination is skipped or does not allow user input.

By adding nextLine() after reading the gender, you ensure that any remaining newline character is consumed, and the subsequent nextLine() for the destination works correctly, allowing the user to input the destination without issues.
         */
        sc.nextLine();
        System.out.println("enter your loacation where you take a bus:"); 
        String yourLocation=sc.nextLine();
        System.out.println("enter location where you want to go:");
        String destination =sc.nextLine();

        //ticket price
        System.out.println("enter ticket price:");
        double ticketPrice=sc.nextDouble();
        //condtion for discount

        double discount=0;
        if(age<5){
            //if age is less than 5
            discount=0.75;
        }
        else if(age>=60){
            //if age is greater than equal to 60
            discount=0.80;
        }
        else{
            //age b/w 5 to 59
            if( gender=='F'|| gender == 'f' ){
                //female
              discount=0.70;
            }
            else{
                discount=0.25;
            }

        }

        //clacualted dicounted on ticket 

        double discountedPrice=ticketPrice-(ticketPrice*discount);
        //ticket genertaion after discount is come
        
        
        
        System.out.println("\nTICKET DETAILS");
        System.out.println(yourLocation+"  "+"to"+"   "+destination);
        System.out.println("\nAge:"+age);
        System.out.println("gender:"+gender);
        System.out.println("Ticket orignal price:"+ticketPrice+"rupee");
        System.out.println("discount applied:"+(discount*100)+"%");
        System.out.println("After discount ticket price:"+discountedPrice+"rupee");
        

        System.out.println("\n\nX--------------------X\n\n");
        

            


    }
}
