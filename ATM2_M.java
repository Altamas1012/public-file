
import java.util.Scanner;

class ATM {
    float Balence;
    int PIN=1012;



   ATM(){
    System.out.println("plz enter your Right Pin: ");
    Scanner sc=new Scanner(System.in);
    int entrpin=sc.nextInt();
    if(entrpin==PIN){
        menu();

    }
    else{
        System.out.println("a valide PIN");
        new ATM();

      

    }

}
 public void menu(){
    System.out.println("Enter your choice  1 ,2, 3, 4: ");
    System.out.println(" 1. Check A/C Balance");
    System.out.println("2. withdrow Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. Exit");

    
      Scanner sc=new Scanner(System.in);
      int opt=sc.nextInt();
      
    if(opt==1){
        CheckBalence();

    }
    else if(opt==2){
        WhithdrawManey();

    }
    else if(opt==3){
        DepositManey();

    }
    else if(opt==4){
      
     return;
    }
    else{
        System.out.println("a valid choice");
       menu();
      
    }
    menu();
    
   
    
 }
 

public void CheckBalence(){
    System.out.println(" Bank Balence: "+Balence);
    menu();
}
public void WhithdrawManey(){
    System.out.println("Enter your Amount to Withdraw:");
    Scanner sc=new Scanner(System.in);
    float Amount=sc.nextFloat();
    if(Amount>Balence){
        System.out.println("in sufficiant balence");
    }
    else{
        Balence=Balence-Amount;
    System.out.println("maney whithdraw succesfull:");
    }

    menu();

}
public void DepositManey(){
    System.out.println("Amount enter diposite money:");
    Scanner sc=new Scanner(System.in);
    float Amount=sc.nextFloat();
  Balence= Balence+Amount;
  System.out.println("Maney deposite succesfull");
  menu();

    
}


}
 public class ATM2_M {
 
    public static void main(String[] args) {
        ATM obj=new ATM();
        
    }
 }
