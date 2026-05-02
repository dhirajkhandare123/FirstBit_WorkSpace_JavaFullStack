
In Java, Comparable is an interface used to define the natural ordering of objects. It lets you specify how instances of a class should be compared to each other.

🔹 What it does

If a class implements Comparable, you can sort its objects (for example, using Collections.sort() or arrays sorting), because Java knows how to compare them.

🔹 The key method

Comparable has one method you must implement:

int compareTo(T other)

🔹 How compareTo works

It returns:

Negative number → current object is less than other
Zero → both objects are equal
Positive number → current object is greater than other

🔹 When to use Comparable

Use it when:

Your class has a single natural way of ordering (e.g., by age, name, ID)
You want sorting to be built into the class itself

🔹 Comparable vs Comparator (quick difference)
Comparable → defines natural/default ordering inside the class. used when you have to implement only single sorting logic.
Comparator → defines custom/external ordering outside the class. used when you have to implement different sorting logics.

