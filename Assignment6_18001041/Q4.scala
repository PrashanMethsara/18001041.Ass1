object Q4 extends App
{ 
   val u=Point(3,6)
   val v=Point(2,9)
   

println("method4:Invert of "+u+"="+u.InvertOfpoint(u))
   
case class Point(x:Int,y:Int)
  { 
   def InvertOfpoint(that:Point)=Point(this.y,this.x)
  }

}