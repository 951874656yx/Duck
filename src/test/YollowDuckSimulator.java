package test;

import model.DecoyDuck;
import model.Duck;
import model.FlyRocketPowered;
import model.MallardDuck;
import model.ModelDuck;

public class YollowDuckSimulator {
	 public static void main(String[] args) {  
	        Duck mallard = new MallardDuck();  
	        mallard.performFly();  
	        mallard.performQuack();  
	        mallard.display();  
	          
	        Duck decoy = new DecoyDuck();  
	        decoy.performFly();  
	        decoy.performQuack();  
	        decoy.display();  
	          
	        Duck model = new ModelDuck();  
	        model.performFly();;  
	        model.performQuack();  
	        model.display();  
	        //动态地改变鸭子的行为  
	        model.setmFlyBehavior(new FlyRocketPowered());  
	        model.performFly();;  
	        model.performQuack();  
	        model.display();  
	    }  
	  
	}  
