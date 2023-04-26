#!/bin/bash
<<comment
35. Write a Shell Script to display the first n terms of the Fibonacci series. 
Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34

comment

t1=0
t2=1
t=0
read -p "Enter number of terms: " terms
for (( i=0; i<$terms; i++ ))
do 
	echo -n "$t1 "
	t=$(( $t1+$t2 ))
	t1=$t2
	t2=$t
done
echo
