object sum extends App
{
def sum(n:Int):Int=n match{
     case n if(n==0) => 0;
     case n if(n>=1) => n+sum(n-1);
     case _ => return 0; 
}

println("sum :"+ sum(5));

}