import java.util.Scanner;


public class Practice55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1=0;
        int x2=0;
        while(x1!=5||x2!=5){
            System.out.println();
    System.out.print("enter rock/paper/scissor: ");
    String a=scan.nextLine();
    if(a.equals("rock")||a.equals("paper")||a.equals("scissor")){
        double random=1+Math.random()*3;
        int Random=(int)random;
        System.out.print("computer input: ");
        switch(Random){
            case 1:{
                System.out.println("rock");
                break;
            }
            case 2:{
                System.out.println("paper");
                break;
            }
            case 3:{
                System.out.println("scissor");
                break;
            }
            default:{
                System.out.println("sry");
                
            }
            
            

        }
      
        if(a.equals("rock")&&Random==2){
            System.out.println("computer win");
            x2+=1;
            //System.out.println(x2);
        }else if(a.equals("rock")&&Random==3){
            System.out.println("user win");
            x1+=1;
            //System.out.println(x1);
        }else if(a.equals("paper")&&Random==1){
            System.out.println("user win");
            x1+=1;
            //System.out.println(x1);
        }else if(a.equals("paper")&&Random==3){
            System.out.println("computer win");
            x2+=1;
            //System.out.println(x2);
        }else if(a.equals("scissor")&&Random==1){
            System.out.println("computer win");
            x2+=1;
            //System.out.println(x2);
        }else if(a.equals("scissor")&&Random==2){
            System.out.println("user win");
            x1+=1;
            //System.out.println(x1);
        }else{
            System.out.println("draw");
        }
        if(x1==5||x2==5){
            break;
        }
        



    }else{
        System.out.println("you write wrong input please try again.");
    }
}
if(x1>x2){
    System.out.println("user scored 5,user win the game");
}else if(x2>x1){
    System.out.println("computer scored 5,computer win the game");
}else{
    System.out.println("draw,none of win the game");
}


        
    }
    
}
