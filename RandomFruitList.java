public class RandomFruitList{
    private static Fruit[] fruits;

    public RandomFruitList(){
        fruits=new Fruit[4];
      
        setFruits();
        
        
        
    }

    public static Fruit[] getRandomFruits(){
        return fruits;
    }
    public static int[] getArr(){
        int[] nums=new int[4];
        for(int i=0;i<4;i++){
            int rand=(int)(Math.random()*4)+1;
            nums[i]=rand;

        }
        
        return nums;
    }
    public void setFruits(){
        Cherry cherry1=new Cherry();
        Apple apple1=new Apple();
        Banana banana1=new Banana();
        Kiwi kiwi1=new Kiwi();
        int[] nums=getArr(); 
        for(int i=0;i<4;i++){
          if(nums[i]==cherry1.getValue()){
             fruits[i]=cherry1;
          }
          else if(nums[i]==apple1.getValue()){
             fruits[i]=apple1;
          }
          else if(nums[i]==banana1.getValue()){
             fruits[i]=banana1;
          }
          else if(nums[i]==kiwi1.getValue()){
             fruits[i]=kiwi1;
          }
        }
        }

        public String toString(){
            int i;
            String listofFruits="";
            for(i=0;i<4;i++){
                 listofFruits+=fruits[i].getName()+" ";
            }
            return listofFruits;
             
         }
}
