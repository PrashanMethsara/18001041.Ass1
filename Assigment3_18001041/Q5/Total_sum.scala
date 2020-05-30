object Total_sum extends App
{
println("Enter a number : ");
val a= scala.io.StdIn.readInt();

def sum_of_even(a:Int):Int=a match{
    case a if(a==0) => 0;
    case a if(a%2==0) => return (a-2)+ sum_of_even(a-2);
    case _ => (a-1) + sum_of_even(a-1);
}

println("sum of even numbers less then user input : " + sum_of_even(a));

}