object primeseq extends App{

primeseq(10);

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

def primeseq(x:Int,a:Int=2):Unit=
 {
   if(x>=2 && a<=x)
   {
     if(prime(a)) {
                  print((a)+",")
                }
     primeseq(x,a+1)
   }
   
 }



}  