object salary extends App{

def normal(hours:Int)=hours*150

def ot(hours:Int)=hours*75

def income(h1:Int,h2:Int)=normal(h1)+ot(h2)

def tax(y:Double)=y*0.10

def homesalary(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2)) 

println("Home salary = "+ homesalary(40,20)+" Rs")


}