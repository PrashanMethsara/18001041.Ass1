object lal extends App {

 println(prime(5));
 println(prime(8));
  
  
def prime(x:Int, y:Int=2):Boolean=  {
  
    if (x <= 2) 
    {
      if(x==1){
           return false
             }
      else {
           return true
             }
    }
     if (x %y == 0) 
    {
      return false; 
    }
    if (y * y > x) 
    {
       return true; 
    }
     return prime(x, y + 1); 
       
  }
  

 
}