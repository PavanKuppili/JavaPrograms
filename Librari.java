
class Demo
{
    public String publishers;
    public double prise;
    public void display(){} 
}
class Book extends Demo
{
    void display(String publishers,double prise,String author,String bookname)
    {
        System.out.println("-----books-----");
        System.out.println("Publishers-:-:"+publishers);
        System.out.println("BookName-:-:"+bookname);
        System.out.println("Author-:-:"+author);
        System.out.println("price-:-:"+prise);
        System.out.println("----------------");
    }
}
class Magazine extends Book{
    void display(String publishers,double  prise,String MgznName,int vol)
    {
         System.out.println("-----Magzine-----");
        System.out.println("Publishers-:-:"+publishers);
        System.out.println("Magzine-Name-:-:"+MgznName);
        System.out.println("volume-:-:"+vol);
        System.out.println("price-:-:"+prise);
        System.out.println("----------------");
    }
}
class Newspaper extends Demo
{
    void display(String publishers,double  prise,String date)
    {
        System.out.println("-----NewsPaper-----");
        System.out.println("Publishers-:-:"+publishers);
        System.out.println("price-:-:"+prise);
        System.out.println("Date-:-:"+date);
    }
}
class Librari
{
    public static void main(String[] args)
    {
        Book bk=new Book();
        bk.display("Dreamtech press",672,"Dr.R.NageswaraRao","core java");
        Magazine mz=new Magazine();
        mz.display("India Today",100,"Living Media",0);
        Newspaper np=new Newspaper();
        np.display("e-nadu",12,"02-11-2024");
    }
}