public class Factory {//tic toc


    //make a varible called yearFounded that is an integer
    //instance varibales at the top of class, they can be seen by every class
    //they have to have the word public
    //scope is the whole class
    public int yearFounded = 1798;
    public String factoryName = "airplaine Factory";
    public boolean isOpen = true;

    public static void main(String[] args) {
        System.out.println("welcome to  Mx. Bradford's factory");
        new Factory();
    }

    //constructor
    //1. is a method
    //2. has same name as class
    //3. no void
    public Factory(){
        isOpen = false;
        //scope for manger is only in the constructory
        String manager = "Mr. Hales";
        System.out.println(manager);
        factoryInfo();

        //todo: change the varible yearfounded to be a different value
        //call factoryInfo(); agian

        //type varName = value
        //object of type airplaine

        Airplaine plane1  = new Airplaine();
        //plane1.name = "jeff";
        System.out.println(plane1.name);
        //todo: give all of plane1's instance vars values
        plane1.capacity = 615;
        plane1.isDoubleDeacker = true;
        plane1.length = 70;
        plane1.model = "b1 b lancer";
        System.out.println(plane1.model);
        Airplaine plane2 = new Airplaine();

        System.out.println(plane2.capacity);
        plane2.capacity = 615;
        //hw: make 2 more airplane objects
        //for one of the objects change all the instance variable
        //for both objects print all the instance variables

    }

    //make a method called factoryInfo,nothing should be in the method.
    public void factoryInfo(){
        //todo: add souts to print out the 3 instance variables
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println("it is " +isOpen + " that the facoty is open");


        System.out.println(factoryName +yearFounded +isOpen);
        //more readable option
        System.out.println("year founded " + yearFounded);
    }

}
