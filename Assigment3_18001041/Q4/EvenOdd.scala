object EvenOdd extends App {

println("Enter a even number : ");
val a= scala.io.StdIn.readInt();
println(iseven(a));

println("Enter a odd number : ");
val b= scala.io.StdIn.readInt();
println(isodd(b));


def iseven(n: Int): Boolean =n match {
   case 0 => true ;
   case _ => isodd(n-1);
}

def isodd(n:Int):Boolean= !(iseven(n));



}