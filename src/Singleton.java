public class Singleton {
    /*
    The Singleton: Design pattern that ensures only one instance of the class exists at all times.
    You'll have global access but only for that particular instance of the class that keeps being referenced
    again and again.
    Going to have a private constructor
     */


    //need a private static variable to hold the instance of this Singleton Class
    //static variables belong to the class itself rather than the instance of the class.
    //so only ONE copy of the static variable exists and is thus shared by all the instance of the class.
    private static Singleton instance;

    //private constructor to prevent user from instantiating more than once.
    private Singleton()
    {
        System.out.println("Singleton has been created!");
    }

    //public method to give global access for this instance
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }




}