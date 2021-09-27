val list = List(1, 2, 3, 4, 5, 6)

list.zipWithIndex.filter(x => (x._2 + 1) % 3 != 0).map(y => y._1)