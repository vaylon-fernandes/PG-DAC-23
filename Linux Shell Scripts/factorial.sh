#!/bin/bash

<<comment
15. Write a Shell Script to calculate the factorial of a given number. 
Test Data :
Input the number : 5
Expected Output :
The Factorial of 5 is: 120
comment

fact=1

read -p "Enter a number: " num
for(( i=1; i<=$num; i++))
do 
fact=$(($fact*$i))
done

echo "Factorial of the $num is $fact"
