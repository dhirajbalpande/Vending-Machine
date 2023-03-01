import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.*;

public class project {
    public static Scanner sc;
    public static final int tealeavesMax = 500;
    public static final int coffeepowderMax = 500;
    public static final int sugarMax = 600;
    public static final int milkMax = 8000;
    public static final int waterMax = 15000;
    
    public static double tealeaves = 500;
    public static double coffeepowder = 500;
    public static double sugar = 600;
    public static double milk = 8000;
    public static double water = 15000;
    
    public static int tealeavesMin = 50;
    public static int coffeepowderMin = 50;
    public static int sugarMin = 50;
    public static int milkMin = 4000;
    public static int waterMin = 600;
    
    public static double teaCost = 1;
    public static double coffeeCost = 2;
    public static double sugarCost = 1.5;
    public static double milkCost = 0.15;
    public static double waterCost = 0.02;
    
    public static void main(String[] args) {
        int n;
         sc = new Scanner(System.in);
        System.out.println("1. Dispense Beverage");
        System.out.println("2. Refill Container");
        System.out.println("3. Show Report");
        System.out.println("4. Exit");  
        System.out.println("Enter the number");
         n = sc.nextInt();
      
        switch (n) {
            case 1:
                dispensebeverage();
                break;
            case 2:
                refillcontainner();
                break;
            case 3:
                showreport();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid Input Please Enter valid Input!!!");
                break;
        }
        while (n<4) {
            System.out.println("\n\n1. Dispense Beverage");
            System.out.println("2. Refill Container");
            System.out.println("3. Show Report");
            System.out.println("4. Exit");  
            System.out.println("Enter the number");
             n = sc.nextInt();

             switch (n) {
                case 1:
                    dispensebeverage();
                    break;
                case 2:
                    refillcontainner();
                    break;
                case 3:
                    showreport();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Input Please Enter valid Input!!!");
                    break;
            }
           }

        System.out.println("Successfully exit!");
    }
    public static void dispensebeverage(){
        System.out.println("Select a beverage\n\nStrong coffee(sc)\n"
        + "Light coffee(lc)\n"
        + "Strong tea(st)\n"
        + "Light tea(lt)\n");

        System.out.println("Enter Beverage: ");
        String beverageName = sc.next();
        System.out.println("Enter numbers of cups: ");
        int cups = sc.nextInt();

        System.out.println("with sugar(1/0): ");
        int booleansugar = sc.nextInt();
        Coffee coffee;
        switch (beverageName) {
            case "sc":
                coffee = new Strongcoffee();
                break;
            case "lc":
                coffee = new Lightcoffee();
                break;
            case "st":
                coffee = new Strongtea();
                break;
            case "lt":
                coffee = new Lighttea();
            default:
            coffee = new Coffee();
                break;
        }

        if (tealeaves-(coffee.gettl()*cups) < tealeavesMin ||
        coffeepowder-(coffee.getcp()*cups) < coffeepowderMin ||
        sugar-(coffee.getsugar()*cups) < sugarMin || 
        milk-(coffee.getmilk()*cups) < milkMin  || 
        water-(coffee.getw()*cups) < waterMin ) {
            System.out.println("Warning! minimum value reached.");
        }
       else{
        tealeaves = tealeaves-(coffee.gettl()*cups);
        coffeepowder = coffeepowder-(coffee.getcp()*cups);
        sugar = sugar-(coffee.getsugar()*cups);
        milk = milk-(coffee.getmilk()*cups);
        water = water-(coffee.getw()*cups);
       }
    }


    public static void refillcontainner(){
        System.out.println("Select a Ingradient\n"
        + "water(w)\n" + "Milk(m)\n" + "Tea(t)\n" + "coffee(c)\n" + "sugar(s)\n");

        System.out.println("Enter an Ingradient");
        String ingradient = sc.next();
        System.out.println("Number of Units");
        int units = sc.nextInt();
        switch (ingradient) {
            case "w":
                water= water-units;
                break;
            case "m":
                milk = milk - units;
                break;
            case "t":
                tealeaves = tealeaves-units;
                break;
            case "c":
                coffeepowder = coffeepowder-units;
                break;
            case "s":
            sugar = sugar-units;
            default:
                break;

        }

        if(water>waterMax || milk>milkMax || tealeaves>tealeavesMax || coffeepowder>coffeepowderMax || sugar>sugarMax){
            System.out.println("Warning! Maximum value reached.");
            water= water+units;
            milk = milk+units;
            tealeaves = tealeaves+units;
            coffeepowder = coffeepowder+units;
            sugar = sugar+units;
        }
       
    }
    public static void showreport(){
        System.out.println("Remaining Qyt of each ingradient");
        System.out.println("Tea_leaves : "+ tealeaves + "\nCoffee powder : "+coffeepowder + "\nsugar : "+sugar +"\nMilk : "+milk + "\nwater : "+water);
    }
    public static void exit(){

    }

}


