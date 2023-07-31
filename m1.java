class m1
{
    //CREATING A METHOD
    static void nine()//nine is the name of the method
    {
        System.out.println("THIS IS A PRANK\n");
    }
    public static void main (String [] args)
    {
        var a = "A method is a block of code which only runs when it is called.\nYou can pass data, known as parameters, into a method.\nMethods are used to perform certain actions, and they are also known as functions.\nWhy use methods? To reuse code: define the code once, and use it many times.\n";
        System.out.println(a);
        nine();// calling the method nine   
        System.out.println("static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.");
        System.out.println("void means that this method does not have a return value. You will learn more about return values later in this chapter.");
    }
}