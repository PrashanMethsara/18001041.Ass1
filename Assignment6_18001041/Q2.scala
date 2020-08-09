object Q2 extends App
{ 
   val u=Point(3,6)
   val v=Point(2,9)
   
println("Move a "+u+" by given distance (4,8)="+u.move(4,8))
   
   
case class Point(x:Int,y:Int)
  { 
   def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  }

}