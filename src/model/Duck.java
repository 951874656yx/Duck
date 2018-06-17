package model;

public abstract class Duck {  
    public Duck() {  
        super();  
       
    }  
     FlyBehavior mFlyBehavior; 
     QuackBehavior mQuackBehavior; 
    public void swim(){  
        System.out.println("All ducks float, even decoys!");  
    }  
    public abstract void display();  
    public   void performFly(){  
        mFlyBehavior.fly(); 
    }  
    public   void performQuack(){  
        mQuackBehavior.quack(); 
    }  
    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {  
        this.mFlyBehavior = mFlyBehavior;  
    }  
    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {  
        this.mQuackBehavior = mQuackBehavior;  
    }  
          
      
  
}  