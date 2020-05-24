object cost extends App{

  cost(60)

    def cost(c: Int) = {
      val book : Double = 24.95*0.6*c
      var shipping : Double = 0.0
      if(c>50) {
          shipping =3 + (c-50)*0.75
      } 

      else{
        shipping =3
      } 
      
      print(book + shipping )

  } 
}