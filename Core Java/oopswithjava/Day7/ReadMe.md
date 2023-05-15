# Day 7
## Non Primitive / reference types 
    1. Interface
    2. class
    3. Type Variable
    4. Array

## Data Structure:
    - Linear / Sequential data structure
        1. Array
        2. Stack
        3. Queue
        4. LinkedList
    - Non Linear
        1. Tree
        2. Graph
        3. Hashtable
* In java data structure is also called as collection.
* Data/value stored inside collection is called element.
* If we want to manage(search/sort) data in RAM efficiently then we should use data structure.
## Types of loop:
    1. do-while
    2. while
    3. for
    4. foreach
## Array
* It is a linear data structure/collection in which we can store multiple elements of same type in continuous memory location.
* In Java, array is a non primitive/reference type. In other words, to create, instance of array new operator is required. It means that array instance get space on heap.
* In array, every element has index and index always begins with 0.
    - index of first element is  : 0
    - index of last element is  : array size - 1
* Types of array:
    1. Single dimensional array
    2. Multi dimensional array
    3. Ragged array
### Single dimensional array
* Consider array instantiation:
```java
new boolean[ 3 ];   //false, false, false
new int[ 3 ];   //0,0,0
new double[ 3 ];    //0.0,0.0, 0.0
```
* Consider array reference declaration
```java
int arr1[ ] = null; //OK
int [ arr2 ] = null; //NOT OK
int[ ] arr3 = null; //OK
```
* Array with reference
```java
int arr[ ] = null;  //OK
arr = new int[ 3 ]; //OK
```
```java
int[ ] arr = null;  //OK
arr = new int[ 3 ]; //OK
```
```java
int arr1[ ] = new int[ 3 ]; //OK
int[ ] arr2 = new int[ 3 ]; //Ok
```
