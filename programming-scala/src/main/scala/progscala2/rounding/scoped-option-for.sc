val dogBreeds = List(Some("Doberman"), Some("Yorkshire Terrier"), Some("Dachshund"),
  Some("Scottish Terrier"), Some("Great Dane"), None, Some("Portugese Water Dog"))

println("First pass:")
for {
  breedOption <- dogBreeds
  breed <- breedOption
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)

println("Second pass:")
for {
  Some(breed) <- dogBreeds
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)