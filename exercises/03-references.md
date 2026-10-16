# Exercise 3: Reference Drills (S13 homework)

Every snippet below uses the `Pet` class from `src/ObjectLab.java`:

```java
Pet(String name, int age)   // sets both
Pet(String name)            // age starts at 1
getName()   getAge()   birthday()   // birthday() adds 1 to age
```

For snippets 1 to 6: **draw** the variables and objects (a box per object, an arrow per reference variable), then write the output. Do this BEFORE you run anything. Draw on paper and paste a photo link, or sketch it as text in the picture box.

## Snippet 1
```java
Pet a = new Pet("Rex", 3);
Pet b = new Pet("Rex", 3);
a.birthday();
System.out.println(a.getAge() + " " + b.getAge());
```
Picture:

Output:

## Snippet 2
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a.birthday();
System.out.println(b.getAge());
```
Picture:

Output:

## Snippet 3
```java
Pet a = new Pet("Mia");
Pet b = new Pet("Zed", 9);
b = a;
b.birthday();
System.out.println(a.getAge() + " " + b.getName());
```
Picture:

Output:

## Snippet 4
```java
String s = "Java";
String t = s;
s = s + "!";
System.out.println(s + " " + t);
```
Picture:

Output:

## Snippet 5
```java
int x = 5;
int y = x;
y++;
System.out.println(x + " " + y);
```
Picture:

Output:

## Snippet 6
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a = null;
System.out.println(b.getName());
```
Picture:

Output:

## Snippet 7 (this one crashes)
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a = null;
b = null;
System.out.println(a.getName());
```
- Exception name:
- Line that crashes:
- Which variable is null?
- Your fix (one line of code):

## Snippet 8: write your own
Write a snippet where two variables alias one `Pet`, then explain its output in two sentences.

```java
// your snippet here
```

Explanation:

## Checked my predictions
Which snippets did I get wrong, and what was I assuming?
