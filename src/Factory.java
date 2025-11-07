public class Factory {

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
    public Factory(){
        isOpen = false;
        //scope for manger is only in the constructory
        String manager = "Mr. Hales";
        System.out.println(manager);
        factoryInfo();

        //todo: change the varible yearfounded to be a different value
        //call factoryInfo(); agian
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
