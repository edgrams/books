val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portugese Water Dog")

for (breed <- dogBreeds
     if breed.contains("Terrier")
) println(breed)