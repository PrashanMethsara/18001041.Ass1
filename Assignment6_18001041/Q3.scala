object Q3 extends App
{ 
   val u=Point(3,6)
   val v=Point(2,9)
   


 println("Distance between "+u+" and "+v+"="+(u-v).DisOfpoints((u-v)))
   
   
case class Point(x:Int,y:Int)
  { 
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
  def DisOfpoints(that:Point):Double=
  {
   val dist=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return dist
  }
  }

}