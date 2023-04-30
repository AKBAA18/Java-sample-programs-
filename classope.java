class classope{
    public String concatt(String a, String b)
    {
        System.out.print(a+b);
        return a+b;
    }
    static int concatt(int c, int d)
    {
        System.out.print(c+d);
        return c+d;
    }
    public static void main(String ar[])
    {
        String x="VOLVO  ";
        String y="BENZ ";
        int m=9;
        int n=10;
        concatt(m,n);
        car mycar=new car();
        mycar.concatt(x,y);
    }
}