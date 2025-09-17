class Main1
{
    public static void main(String args[])
    {
	int num=9,r=0,sum=0;
	int square=(int)Math.pow(num,2);
	System.out.println(square);
	while(square!=0)
	{
		r=square%10;
                sum+=r;
                square/=10;
         }
       System.out.println(sum);
       if(sum==num)
         System.out.println(num+" "+ "is a evil number");
       else
         System.out.println(num+" "+ "is not a evil number");
    }
}
//
class Main2
{
    public static void main(String args[])
      {
        int num=132,r=0,sum=0,pro=1,temp=num;
        while(num!=0)
          {
            r=num%10;
            sum+=r;
            pro*=r;
            num/=10;
           }
        System.out.println(sum);
        System.out.println(pro);
        if(sum==pro)
          System.out.println(temp+" "+ "is a power number");
        else
          System.out.println(temp+" " + "is  not a power number");
       }
}
//
class Main3
{
    public static void main(String args[])
    {
      int num=5,r=0;
      int square=(int) Math.pow(num,2);
      System.out.println(square);
      if(square>99)
         r=square%100;
      else
         r=square%10;
      if(r==num)
        System.out.println(num+" "+" is a Automatic number");
      else
        System.out.println(num+" "+" is not a Automatic number");
     }
}

//
class Main4
{
   public static void main(String args[])
   {
     int num=1312,r=0,temp=num,c=0,sum=0;
     while(num!=0)
      {
         c++;
         num/=10;
      }
      System.out.println(c);
      int m = (int) Math.pow(10,c/2);
      int t1=temp;
      while(temp!=0)
      {
       r=temp%m;
       sum+=r;
       temp/=m;
      }
      System.out.println(sum);
      int square= (int) Math.pow(sum,2);
      System.out.println(square);
      if(t1==square)
        System.out.println(t1+ "  " +" is a technology Number");
      else
        System.out.println(t1+ "  "+" is not a technology Number");
    }
}
//
class Main5
{
    public static void main(String args[])
     {
       int num=148,r=num%10;
       if(r==7)
         System.out.println(num+" "+ "is a busy number");
       if(num%7==0)
         System.out.println(num+" "+" is a busy number");
       else
         System.out.println(num+" "+" is not a busy number");
         
      }
}

//
class Main6
{
   public static void main(String args[])
   {
     int num=199,r=0,sum1=0;
     while(num!=0)
      {
        sum1+=num%10;
        num/=10;
      }
     System.out.println(sum1);
     while(sum1>9)
      {
         int temp=sum1;
         int sum2=0;
         while(temp!=0)
         {
           sum2+=temp%10;
           temp/=10;
         }
         sum1=sum2;
      }
     System.out.println(sum1);
   }
}
              
//
class Main9
   {
     public static void main(String args[])
   {
     int year=2025;
     if(year%4==0 && year%100!=0)
       System.out.println("is a leap year");
     else if(year%4==0 && year%400==0)
        System.out.println("is a leap year");
     else
        System.out.println("is not a leap year");
    }
}






 







































