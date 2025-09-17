//check the number is Armstrong or not
class Main1{
public static void main(String args[])
{
int num=135,r=0,count=0,t=num,sum=0,t1=0;
while(num!=0)
{
r=num%10;
count++;
num/=10;
}
System.out.println(count);
t1=t;
while(t!=0)
{
r=t%10;
sum+=Math.pow(r,count);
t/=10;
}
if(sum==t1)
System.out.println(sum +"is a Armstrong number");
else
System.out.println(sum +"is not a Armstrong number");
}
}

//check the num is palindrome or not,if palindrome check num is prime or not.
class Main2
{
public static void main(String args[])
{
int num=11,rev=0,r=0,t=num,c=0;
while(num!=0)
{
r=num%10;
rev=rev*10+r;
num/=10;
}
if(t==rev)
System.out.println(rev +" " +"is a palindrome");
else
System.out.println(rev+" "+" is not a palindrome");
for(int i=2;i<=rev/2;i++)
{
if(rev%i==0)
{
   c++;
   break;
}
}
if(c==0)
System.out.println(rev+" is prime number");
else
System.out.println(rev+" is not a primenumber");


}
}

//print fibonacci Series upto 20 numbers
class Main3
{
public static void main(String args[])
{
int f=0,s=1,t=0,n=20;
System.out.println(f);
System.out.println(s);
for(int i=0;i<n-2;i++)
{
 t=f+s;
 System.out.println(t);
 f=s;
 s=t;
}
}
}

//1 to 10 multiplication tables
class Main4
{
public static void main(String args[])
{
int n=10,mul=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
 mul=i*j;
 System.out.println(i+"*"+j+"="+mul);
}
}
}
}

// check the number is twisted prime or not

class Main5
{
public static void main(String args[])
{
int num=11,c=0,count=0,t=num,rev=0,r=0;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
   c++;
   break;
}
}
if(c==0)
System.out.println(num +" is prime number");
else
System.out.println(num+" is not a primenumber");
while(num!=0)
{
r=num%10;
rev=rev*10+r;
num/=10;
}
if(t==rev){
System.out.println(rev + "is a twisted prime number");
}
else
{ 
  for(int i=2;i<=rev/2;i++)
{
if(rev%i==0)
{
   count++;
   break;
}

}
if(count==0)
System.out.println(t + "is a twisted prime");
else
System.out.println(t + "is not a twisted prime");
}
}
}

///
class Main6
{
public static void main(String args[])
{
int n=10;
System.out.println(n);
while(n!=1)
{
if (n%2==0)
{ 
n/=2;
}
else
{
n=(3*n)+1;
}
System.out.println(n);
}
}
}


   


 







































