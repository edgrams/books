# save to variable using <-
x <- c(1,3,2,5)
print(x)

# save to variable using =
x = c(1,6,2)
print(x)
y = c(1,4,3)
print(y)

# add two vectors together, check length first
length(x)
length(y)
print(x + y)

# look at a list of known objects
ls()

# remove objects we don't want
rm(x,y)
ls()

# remove all objects at once
rm(list=ls())

# learn about the matrix function
?matrix

# create a simple matrix (optional - specify name of args
# otherwise R will assume args go in a particular order)
x = matrix(data=c(1,2,3,4), nrow=2, ncol=2)

# populate matrix in order by rows
print(matrix(c(1,2,3,4), 2, 2, byrow=TRUE))

# return the square root of each element in a vector or matrix
print(sqrt(x))

# raise each element to the power of 2
print(x^2)

# generate a matrix or random normal variables
x = rnorm(50)

# generate another matrix correlated with previous matrix
y = x+rnorm(50, mean=50, sd=.1)

# show correlation
print(cor(x,y))

# set the seed if we want to reproduce the exact same set of random numbers
set.seed(1303)
print(rnorm(50))

# mean, variance and standard deviation
set.seed(3)
y = rnorm(100)

print(mean(y))

print(var(y))

print(sqrt(var(y)))

print(sd(y))