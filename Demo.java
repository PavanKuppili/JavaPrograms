class Demo
{
public static void main(String args[])
{
int purc=317450;
if (purc >250000)
{System.out.println("30% discount=="+ ( purc - (purc*30/100)));
}
else if(purc >100000)
{System.out.println("25% discount=="+(purc-(purc*25/100)));
}
else if(purc >50000)
{System.out.println("20% discount=="+(purc-(purc*20/100)));
}
else if(purc >10000)
{System.out.println("10% discount=="+(purc-(purc*10/100)));
}
else if(purc >5000)
{System.out.println("5% discount=="+(purc-(purc*5/100)));
}
else
{
System.out.println("no discount applied");
}
}}