class m5{
    public static void main (String [] args){
        int ram = sum(5);
        System.out.println("---------------------------------------------JAVA RECURSION------------------------------------------------");
        System.out.println(ram);
    }
    static int sum(int k){
        if (k>0){
            return k + sum(k-1);
        }
        else
        {
            return 0;
        }
    }
}
