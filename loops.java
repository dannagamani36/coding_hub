//extracting two from number and print as perfect square or not
class Main
{
public static void main (String args[])
{
int n=148116,r=0,d=0;
double res=0;
while(n!=0)
{
r=n%100;
res=Math.sqrt(r);
d=(int)res;
if (res==d)
   {
     System.out.println("is a perfect square:"+" "+r +" "+res);
   }
else
   {
     System.out.println("is not a perfect square :"+" "+r+" "+res);
   } 
n/=100;

}
}
}
// print the sum of even digits and check the sum is perfect square or not
class Main1
{
public static void main (String args[])
{
int n=1898 ,r=0,s=0,d=0;
double t=0;
while(n!=0)
{
r=n%10;
if (r%2==0)
{
 s+=r;
}
n/=10;
}
 System.out.println(s);
t=Math.sqrt(s);
d=(int)t;
if(d==t)
{
  System.out.println(" is a perfect square number :"+ s + " "+ t);
}
else
{
  System.out.println(" is not a perfect square number :"+ s + " "+ t);
}
}
}

//sum of odd position digits + multiplication of even position digits =check that given number is Armstrong or not.

class Armstrong1
{
public static void main(String args[])
{
int n=1898,r=0,c=0,count=0,s=0,m=1,totalsum=0,a=0,t2=0,t1=0;
while(n!=0)
{
r=n%10;
c+=1;
if(c%2==0)
{
  m*=r;
}
else
{
  s+=r;
}
n/=10;
}
System.out.println(m);
System.out.println(s);
totalsum=s+m;
System.out.println(totalsum);
t1=totalsum;
t2=t1;
while(totalsum!=0)
{
totalsum/=10;
count+=1;
}
System.out.println(count);
while(t1!=0)
{
r=t1%10;
a+=(int)Math.pow(r,count);
t1/=10;
}
System.out.println(a);
if(t2==a)
{
 System.out.println("armstrong number"+" "+a);
}
else
{
  System.out.println("Not a armstrong number"+" "+a);
}
}
}
//
class Main3
{
public static void main(String[] args)
{
int num=23224,r=0,t=0,z=0,count=0;
while(num!=0)
{
r=num%10;
z=r;
t+=1;
if (z==r)
{
  count++;
}
else
{
  count=1;
}
System.out.println(r + " " +count);
num/=10;
}

}
}
//

class Main4
{
public static void main (String args[])
{
int num=469874,r=0,c=0;
boolean s = true,t=false;
do
{
r=num%10;

if(r%2==0)
{
 System.out.println(r+ " "+ "is a even number");
}
else
{
System.out.println(r+" "+"is a odd number");
}
num/=10;
if (r>0)
{
if(num==0)
{
 System.out.println("Do you want to check another digit:"+t);
}
else
{
System.out.println("Do you want to check another digit:"+s);
}
}
else
{
System.out.println("Nothing");
}
}while(num!=0);
System.out.println("Stop");
System.out.println("Thankyou");
}
}
//

class Main5
{
public static void main (String args[])
{
int num=469874,r=0,c=0;
String s=" Yes ";
do
{
r=num%10;
System.out.println( r%2==0?(r+"is even"):(r+"is odd"));
c+=1;
if(c!=c++)
{
System.out.println("Do you want to check another digit");
}
}while(num!=0 && s=="Yes");
System.out.println("Stop");
System.out.println("Thank you");
}
}
//
//49656790
class Main6
{
public static void main (String args[])
{
int num=119656790,r=0,c=0,t=num;
char ch=0;
double v=Math.pow(10,3);
do
{
r=num%10;
c+=1;
num/=10;
}while (num!=0);
System.out.println(c);
while( t!=0)
{ 
if (c%2==0)
 {
  r=t%100;
  ch=(char)r;
  System.out.println(ch);
  t/=100;
 }
 else
   {
   r=t%(int)v;
   t/=(int)v;
   ch=(char)r;
   }
}
System.out.println(r);
System.out.println(ch);
}
}
//

class fac
{
public static void main (String args[])
{
int n=5,r=3,p1=1,p2=1,p3=1,d=n-r,t=0;
for(int i=1;i<=n;i++)
 {
   p1*=i;
  }
for(int j=1;j<=r;j++)
  { 
    p2*=j;
  }
for(int k=1;k<=d;k++)
  {
    p3*=k;
  }
t=p1/(p2*p3);
System.out.println(t);
}
}
//print 2 table
class Main7
{
public static void main(String args[])
{
int mul=3,n=0,m=7;
for(int i=1;i<=10;i++)
 {
  n=mul*i;
  System.out.println(mul+"X"+i+"="+n);
  if(n%m==0)
   {
     System.out.println(m+"X"+mul+"="+n);
   }
 }
}
}
//print reverse of 2 table
class Main8
{
public static void main(String args[])
{
int mul=2,n=0;
for(int i=10;i>=1;i--)
 {
  n=mul*i;
  System.out.println(mul+"X"+i+"="+n);
 }
}
}
//sum of first natural number;
class Main9
{
public static void main(String args[])
{
int sum=0;
for(int i=1;i<=5;i++)
 {
   sum+=i;
 }
System.out.println(sum);
}
}
//
class Main10
{
public static void main(String args[])
{
for(int i=1;i<=100;i++)
{
 if(i%2==0)
  {
    System.out.println(i +"is even number");
  }
 else
  {
    System.out.println(i+"is odd number");
  }
}
for(int j=200;j<=400;j++)
{
 if(j%2==0)
  {
    System.out.println(j+"is even number");
  }
 else
  {
    System.out.println(j+"is odd number");
  }
}

}
}

// factors of a number
 class Main11
{
public static void main(String args[])
{
int num=50,count=0,sum=0;
for(int x=2;x<=25;x++)
{
    if(num%x==0)
    { 
       count++;
       sum+=x;
       System.out.println(x);
    }
  break;
}
System.out.println("count of factors:"+count);
System.out.println("sum of factors:"+sum);
if(count==0)
 {
   System.out.println(num+" "+"is a prime number");
 }
 else
 {
   System.out.println(num+" "+"is not a prime number");
 }
}
}
}
//no of consonants are present in characters and no of vowels,no of symbols
class Main12
{
public static void main(String args[])
{
 char ch=0;
 int count=0,concount=0,splcount=0;
for(int i=0;i<=127;i++)
 {
  if(i>='A' && i<='Z')||(i>='a' && i<='z'))
   { 
      if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='a'||i=='e'||i=='i'||i='o'||i=='u')
       {
          System.out.println("Vowels:"+i);
          count++;
       }
      else{
           System.out.println("consonants:"+i);
           concount++;
          }
   }
  else
  {
    System.out.println("special symbols:"+i);
    splcount++;
  }
}
System.out.println(count);
System.out.println(concount);
System.out.println(splcount);
   
}
}
   
    
   
 
 
 




























































































































public static void main(String args[])
{
char ch=0;
for(int i=65;i<=90;i++)
{
 ch=(char)(i+32);
 System.out.println(i+" "+ch);
}
}
}
//
class Main13
{
public static void main (String args[])
{
int m=2,n=3;
for(int i=1;i<=15;i++)
{
double square=Math.pow(i,m);
double cubic=Math.pow(i,n);
System.out.println(i+"-"+(int)square+"-"+(int)cubic);
}
}
}



























  


