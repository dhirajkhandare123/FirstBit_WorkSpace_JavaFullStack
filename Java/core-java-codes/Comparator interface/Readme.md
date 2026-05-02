
# 📘 Comparator Interface in Java
🔹 Definition

Comparator is an interface in Java used to define custom sorting logic for objects. It belongs to the java.util package.

#### 🔹 Why use Comparator?

Use Comparator when:

You want multiple ways to sort the same object
You cannot modify the class (e.g., third-party class)
You need external/custom sorting logic

#### 🔹 Comparator vs Comparable

| Feature       | Comparator               | Comparable                |
| ------------- | ------------------------ | ------------------------- |
| Package       | java.util                | java.lang                 |
| Method        | compare(o1, o2)          | compareTo(obj)            |
| Sorting Logic | External                 | Internal (inside class)   |
| Flexibility   | Multiple sorting options | Only one natural ordering |

#### 🔹 Advantages
  1. Supports multiple sorting criteria
  2. Keeps class clean (no modification needed)
  3. Works well with lambda expressions
  4. More flexible than Comparable

🔹 Important Notes
Always ensure consistency in comparison logic
Avoid subtracting values (especially double)
Prefer built-in methods like:
  1. Comparator.comparing()
  2. Comparator.comparingInt()
  3. Comparator.comparingDouble()
  
  
