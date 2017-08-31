This is a short Java project to calculate prime numbers.

Explaining the model: it's a simple recursion where the input is a range of integers between 2 and a given number. (Because 2 is the first prime number)
In every call it removes the items where the following condition is true : (currentInteger % firstIntegerOfList == 0) and appends the firstIntegerOfList to the output because it will always be a prime.
This is a simple and quick approach to find prime numbers using Stream.