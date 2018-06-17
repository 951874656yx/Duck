package model;

public class DecoyDuck extends Duck {  
    
    public DecoyDuck() {  
        super();  
        // TODO Auto-generated constructor stub  
        mFlyBehavior = new FlyNoWays();  
        mQuackBehavior = new MuteQuack();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a duck Decoy");  
  
    }  
  
}  