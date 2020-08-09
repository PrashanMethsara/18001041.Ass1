object Q1 extends App
{ 
   val u=Point(3,6)
   val v=Point(2,9)
   
   println("Add(+) "+u+" and "+v+"="+(u+v))
   

case class Point(x:Int,y:Int){
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)}

}