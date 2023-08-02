class m3
{
    static double dope(double x, double y){
        return x + y;
    }
    static int dang(int x , int y){
        return x + y;
    }
    public static void main(String[]args){
      double d =  dope(5.5,8.1);
        int  t =  dang(5,8);
        System.out.println("----------------------------------------THIS PROGRAM USED OVERLOADING PROPERTY OF JAVA--------------------------------------------");
        System.out.println("int = "+ t);
        System.out.println("double = "+ d);
    }
}