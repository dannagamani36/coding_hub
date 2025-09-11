//even multiples of 2 table
class Main7
{
public static void main(String args[])
{
int mul=2,n=0,sum=0;
for(int i=1;i<=10;i++)
 {
   if (i%2==0)
     {
       n=mul*i;
       System.out.println(mul+"X"+i+"="+n);
       sum+=n;
     }
     
 }
 System.out.println(sum);
}
}
//odd multiples of 2 table
class Main8
{
public static void main(String args[])
{
int mul=3,n=0,sum=0;
for(int i=1;i<=10;i++)
 {
   if (i%2!=0)
     {
       n=mul*i;
       System.out.println(mul+"X"+i+"="+n);
       sum+=n;
     }
     
 }
 System.out.println(sum);
}
}
//print the 7 multiplication number if the result is even
class Main9
{
public static void main(String args[])
{
int mul=7,n=0,sum=0;
for(int i=1;i<=10;i++)
 {
   n=mul*i;
   if (n%2==0)
     {
       System.out.println(mul+"X"+i+"="+n);
       
     }
     
 }
}
}
//
class Main10
{
public static void main(String args[])
{
int mul=3,n=0,sum=0,count=0;
for(int i=1;i<=10;i++)
 {
   n=mul*i;
   if (n%2!=0)
     {
       System.out.println(mul+"X"+i+"="+n);
       sum+=n;
     }
     
 }
  System.out.println(sum);
  for(int z=1;z<=sum;z++)
   {
     if(sum%z==0)
      {
        count++;
        System.out.println("factors"+" "+z);
      }
     
   }
  if (count==2)
{
  System.out.println(sum+" "+"is a prime number");
}
else
{
 System.out.println(sum+" "+"is not a prime number");
} 
}
}
//print


 
  
