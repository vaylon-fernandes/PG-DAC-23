#!/bin/bash
<<comment
16. Write a Shell Script to display the sum of n terms of even natural numbers. 
Test Data :
Input number of terms : 5
Expected Output :
The even numbers are :2 4 6 8 10
The Sum of even Natural Number upto 5 terms : 30
comment

read -p "Input number of terms: " n
echo -n "The even numbers are: "

sum=0
count=0
num=1

while (( $count<$n ))
do
	if [ $(($num%2)) -eq 0 ]
	then
		echo -n "$num "
		sum=$(($sum+$num))
		count=$(($count+1))
	fi
	num=$(($num+1))
done
echo -e "\nThe Sum of even Natural Number upto $n terms : $sum"
