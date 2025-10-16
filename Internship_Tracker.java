import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
//Change access or something to private in order to maintain the privacy of the code 
class Internship_Tracker{
    public static void main(String[] args){
        ArrayList <String> usr_Info = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pathway+");
        int EscPara = 0;
        while(EscPara == 0){
        System.out.println("\nAre you a returning user?(Yes/No):");
        String UsrResp = input.nextLine();
        String UsrName;
        String Pass_wrd;
        UsrResp = UsrResp.toLowerCase();
        if(UsrResp.equals("yes")){
            System.out.println("Enter your usrname:");
            UsrName = input.nextLine();
            try(BufferedReader reader = new BufferedReader(new FileReader(UsrName))){
                System.out.printf("Welcome back %s,\nEnter your password:",UsrName);
                Pass_wrd = input.nextLine();

            }
            catch(Exception e){
                System.err.println("Account doesn't exist.");
                System.exit(0);
            }
            EscPara++;
        }
        else if(UsrResp.equals("no")){
            System.out.println("Lets get an account started for you!");
            System.out.println("What username would you like to use?:");
            UsrName = input.nextLine();
            try{BufferedWriter file = new BufferedWriter(new FileWriter(UsrName));
                file.write(UsrName);
                file.write("\n");
                System.out.println("What is the password you would like to use?");
                Pass_wrd = input.nextLine();
                file.write(Pass_wrd);
                //You could utilize a randomization function in order to provide the user a 4 number code to enter to confirm the new account 
                file.close();
                System.out.println("Your account is now setup.");
            }
            catch(Exception e){
                System.err.println("File Failed to Open.");
                input.close();
                System.exit(0);
            }
            EscPara++;
        }
        else{
            System.out.println("Enter yes or no for you option choice:");
        }
    }
    //Continue coding here 
    
    input.close();
    }
}