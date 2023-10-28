import java.util.Scanner;

class Person {
    public static void main(String[] args) {

        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score:");
        score = input.nextInt();

        if(score >=0 && score <=100) {
            if(score <=100 && score >=90) {
                System.out.println("AA " + score);
            }
            if(score <=89 && score >=80) {
                System.out.println("AB " + score);
            }
            if(score <=79 && score >=70) {
                System.out.println("BA " + score);
            }
            if(score <=69 && score >=50) {
                System.out.println("BB " + score);
            }
            if(score <=49) {
                System.out.println("FF" + score + " You are failed on exam!");
            }
           
        }else {
            System.out.println("Your score is invalid. You should enter a valid score.");
        }
    }
}