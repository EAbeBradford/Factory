public class Airplaine {
    /// instance vars
    /// 1. used in the whole class
    /// 2. they should be at the top of the class
    /// 3. have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDeacker;
    public int length;

    //construvtor
    public Airplaine(){
        capacity = 250;
        name = "Jacob6";
        model = "boeing 737";
        isDoubleDeacker = false;
        length =  157;
    }


    //constructor with parameter
    public Airplaine(int pCapacity){
        capacity = pCapacity;
        name = "Jacob6";
        model = "boeing 737";
        isDoubleDeacker = false;
        length =  157;
    }

    //todo: make a method called printInfo() that prinhts the airplains instance varibales
    public  void printInfo(){
        System.out.println(capacity);
        System.out.println(model);
        System.out.println(isDoubleDeacker);
        System.out.println(name);
        System.out.println(length);
    }

}
