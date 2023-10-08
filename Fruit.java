//Fruit parent class

public abstract class Fruit {
    private int num; 
    public Fruit(){
        getNum();
    }
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num=num;
    }
    public abstract String getName();
}
