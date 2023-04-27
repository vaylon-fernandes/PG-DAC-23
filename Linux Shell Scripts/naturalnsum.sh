#!/bin/bash

<<comment
3. Write a Shell Script to display n terms of natural numbers and their sum. 
Test Data : 7
Expected Output :
The first 7 natural number is :
1 2 3 4 5 6 7
The Sum of Natural Number upto 7 terms : 28
comment

read -p "Enter a number greater than 0: " n
echo "The first $n natural numbers are: "
sum=0
for(( i=1; i<=n; i++ ))
do 
echo -n "$i "
sum=`expr $sum + $i`
done
echo -e "\nSum of first $n natural numbers is $sum"
