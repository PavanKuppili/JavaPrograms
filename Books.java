class Book
{
    public String title;
    public String author;
    public int price;
    public void getDescription()
    { }
}
class Ebook extends Book
{
    void getDescription(String title,String author,float size)
    {
        System.err.println("--ebook--");
        System.out.println("title::"+title);
        System.out.println("author::"+author);
        System.out.println("file-size::"+size+"mb");
    }
}
class PrintedBook extends Book
{
    void getDescription(String title,String author,float weight)
    {
        System.out.println("---Printed book---");
        System.out.println("title::"+title);
        System.out.println("author::"+author);
        System.out.println("weight::"+weight+"kg");
    }
}
class Books
{
    public static void main(String[] args)
    {
        Ebook Eb=new Ebook();
        Eb.getDescription("java", "JAMES GOSLING",17);
        PrintedBook Pb=new PrintedBook();
        Pb.getDescription("java", "JAMES GOSLING",1);
    }
}