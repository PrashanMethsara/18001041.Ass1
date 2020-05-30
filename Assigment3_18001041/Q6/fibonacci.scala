object fibonacci extends App
{
print("Enter a number : ");
val a= scala.io.StdIn.readInt();

def fib_seq(a:Int):Any={
if(a>0)
fib_seq(a-1);
print(" "+ fibo(a));
}

def fibo(n:Int):Int=n match{
   case n if(n==0) =>0;
   case n if(n==1) =>1;
   case _ => return fibo(n-1)+fibo(n-2);
}

print("List of fibonacci numbers =");
fib_seq(a);

}