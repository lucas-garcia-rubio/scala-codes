import scala.collection.mutable.ListBuffer

val teste = List(1, 2, 3, 4, 5)

teste.indices

val list = teste.to[ListBuffer]

list.remove(4)

list