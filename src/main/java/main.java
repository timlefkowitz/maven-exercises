import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;


public class main {

    //instances


    //constructors
    public static void swapText(){
        System.out.println("Enter text you want to swap");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        boolean loop = true;
        while(loop){
            isNumeric(userInput);
            loop = false;
        } else if (loop == true){
            System.out.println(swapCase(userInput));
            System.out.println(reverse(userInput));
        }


    }


    //main
    public static void main(String[] args){
        swapText();

    }





}
