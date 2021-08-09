object Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

  val enc =(c:Char,k:Int,a:String)=>if(a.contains(c)) a((a.indexOf(c)+k)%a.length) else c

  val dec = (c:Char,k:Int,a:String)=>if(a.contains(c)) a((a.indexOf(c)-k)%a.length) else c

  val cipher = (algo:(Char,Int,String)=>Char,s:String,k:Int,a:String)=>s.map(algo(_,k,a))

  val x = "Deenath123"

  val y =cipher(enc,x,5,alphabet)

  println(cipher(dec,y,5,alphabet))
}
