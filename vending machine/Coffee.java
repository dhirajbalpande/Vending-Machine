public class Coffee {
    double sugar, milk, cp, tl, w;
    double sp;
    public static double getsugar(){
        return 0;
    }
    public static double getmilk(){
        return 0;
    }
    public static double getcp(){
        return 0;
    }
    public static double gettl(){
        return 0;
    }
    public static double getw(){
        return 0;
    }
    public static double getsp(){
        return 0;
    }
}
class Strongcoffee extends Coffee{
    public static double getsugar(){
        return 2;
    }
    public static double getmilk(){
        return 50;
    }
    public static double getcp(){
        return 4;
    }
    public static double gettl(){
        return 0;
    }
    public static double getw(){
        return 100;
    }
    public static double getsp(){
        return 17.5;
    }
}

class Lightcoffee extends Coffee{
    public static double getsugar(){
        return 1.5;
    }
    public static double getmilk(){
        return 60;
    }
    public static double getcp(){
        return 2;
    }
    public static double gettl(){
        return 0;
    }
    public static double getw(){
        return 100;
    }
    public static double getsp(){
        return 16.5;
    }
}

class Strongtea extends Coffee{
    public static double getsugar(){
        return 2;
    }
    public static double getmilk(){
        return 30;
    }
    public static double getcp(){
        return 0;
    }
    public static double gettl(){
        return 4;
    }
    public static double getw(){
        return 150;
    }
    public static double getsp(){
        return 15.50;
    }
}

class Lighttea extends Coffee{
    public static double getsugar(){
        return 1.5;
    }
    public static double getmilk(){
        return 40;
    }
    public static double getcp(){
        return 0;
    }
    public static double gettl(){
        return 5;
    }
    public static double getw(){
        return 150;
    }
    public static double getsp(){
        return 15;
    }
}