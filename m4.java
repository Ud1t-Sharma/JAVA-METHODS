class m4{
    public static void main (String [] args){
        int x = 88, y = 99 ,v = x + y;
        System.out.println("------------------------------------------------JAVA SCOPE-----------------------------------------------------");
        {
            int z = 4 ,n = x + y + z;
            System.out.println("SUM OF X , Y AND Z = " + n);
        }
        // System.out.println(x+y+z); this states error because int z is not applicable here, it is out of scope;
        System.out.println("SUM OF X AND Y = " + v);
    }
}