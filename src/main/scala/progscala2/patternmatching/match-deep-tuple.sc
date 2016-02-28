val itemCosts = Seq(("Pencil", 0.52), ("Paper", 1.35),
  ("Notebook", 2.43))
val itemsCostsIndices = itemCosts.zipWithIndex
for (itemCostIndex <- itemsCostsIndices) {
  itemCostIndex match {
    case ((item, cost), index) => println(s"$index: $item " +
    s"costs $cost each")
  }
}