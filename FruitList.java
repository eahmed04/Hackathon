import java.util.Scanner;

public class FruitList {
    
  
    private static Fruit[] playerList;
    public static void main(String[] args){
        RandomFruitList randomfruits=new RandomFruitList();
        System.out.println(randomfruits);
        FruitList fruits1=new FruitList();
       
       
        
        System.out.println(trueOrfalse());

    }
   
    public FruitList(){
       
        playerList=new Fruit[4];
    
        setPlayerList();
        
        
    }
    //
    

    
    //use a for loop, in the loop there is an empty list. The loop runs 4 times, after each time it will generate a random # and add to list
   
         public void setPlayerList(){
            Scanner scan=new Scanner(System.in) ;
            System.out.println("Enter your 4 values:");
            String playeritem1=scan.next();
            String playeritem2=scan.next();
            String playeritem3=scan.next();
            String playeritem4=scan.next();

            if (playeritem1.equals("cherry") || playeritem1.equals("Cherry")) {
                Cherry cherryPlayer = new Cherry();
                playerList[0] = cherryPlayer;
            }
            
            else if (playeritem1.equals("Banana") || playeritem1.equals("banana")) {
                Banana bananaPlayer = new Banana();
                playerList[0] = bananaPlayer;
            }
            
            else if (playeritem1.equals("Kiwi") || playeritem1.equals("kiwi")) {
                Kiwi kiwiPlayer = new Kiwi();
                playerList[0] = kiwiPlayer;
            }
            
            else if (playeritem1.equals("apple") || playeritem1.equals("Apple")) {
                Apple applePlayer = new Apple();
                playerList[0] = applePlayer;
            }
            
            
            if (playeritem2.equals("cherry") || playeritem2.equals("Cherry")) {
                Cherry cherryPlayer = new Cherry();
                playerList[1] = cherryPlayer;
            }
            
            else if (playeritem2.equals("Banana") || playeritem2.equals("banana")) {
                Banana bananaPlayer = new Banana();
                playerList[1] = bananaPlayer;
            }
            
            else if (playeritem2.equals("Kiwi") || playeritem2.equals("kiwi")) {
                Kiwi kiwiPlayer = new Kiwi();
                playerList[1] = kiwiPlayer;
            }
            
            else if (playeritem2.equals("apple") || playeritem2.equals("Apple")) {
                Apple applePlayer = new Apple();
                playerList[1] = applePlayer;
            }
            
            if (playeritem3.equals("cherry") || playeritem3.equals("Cherry")) {
                Cherry cherryPlayer = new Cherry();
                playerList[2] = cherryPlayer;
            }
            
            else if (playeritem3.equals("Banana") || playeritem3.equals("banana")) {
                Banana bananaPlayer = new Banana();
                playerList[2] = bananaPlayer;
            }
            
            else if (playeritem3.equals("Kiwi") || playeritem3.equals("kiwi")) {
                Kiwi kiwiPlayer = new Kiwi();
                playerList[2] = kiwiPlayer;
            }
            
            else if (playeritem3.equals("apple") || playeritem3.equals("Apple")) {
                Apple applePlayer = new Apple();
                playerList[2] = applePlayer;
            }
            
            if (playeritem4.equals("cherry") || playeritem4.equals("Cherry")) {
                Cherry cherryPlayer = new Cherry();
                playerList[3] = cherryPlayer;
            }
            
            else if (playeritem4.equals("Banana") || playeritem4.equals("banana")) {
                Banana bananaPlayer = new Banana();
                playerList[3] = bananaPlayer;
            }
            
            else if (playeritem4.equals("Kiwi") || playeritem4.equals("kiwi")) {
                Kiwi kiwiPlayer = new Kiwi();
                playerList[3] = kiwiPlayer;
            }
            
            else if (playeritem4.equals("apple") || playeritem4.equals("Apple")) {
                Apple applePlayer = new Apple();
                playerList[3] = applePlayer;
            }

         

         

       }
       public static boolean trueOrfalse(){
        
        boolean result=false;
        for(int i=0;i<4;i++){
            if(playerList[i].getClass().equals(RandomFruitList.getRandomFruits()[i].getClass())){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        if(result==true){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }
        return result;
       }
        
    
    public String toString(){
       int i;
       String listofFruits="";
       for(i=0;i<4;i++){
            listofFruits+=playerList[i].getName()+" ";
       }
       return listofFruits;
        
    }
    
} 
