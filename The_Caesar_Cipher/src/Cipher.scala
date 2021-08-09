object Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

  val enc =(c:Char,k:Int,a:String)=>if(a.contains(c)) a((a.indexOf(c)+k)%a.length) else c

  val dec = (c:Char,k:Int,a:String)=>if(a.contains(c)) a(if(a.indexOf(c)<k) a.length-k+a.indexOf(c) else a.indexOf(c)-k ) else c

  val cipher = (algo:(Char,Int,String)=>Char,s:String,k:Int,a:String)=>s.map(algo(_,k,a))

  val x = "abz"

  val y =cipher(enc,x,5,alphabet)

  println(y)

  println(cipher(dec,y,5,alphabet))
}
