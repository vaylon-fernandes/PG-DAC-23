#!/bin/bash
<<comment
8. Write a Shell Script to display the n terms of odd natural numbers and their sum. 
Test Data
Input number of terms : 10
Expected Output :
The odd numbers are :1 3 5 7 9 11 13 15 17 19
The Sum of odd Natural Number upto 10 terms : 100
comment

read -p "Input number of terms: " n
echo -n "The odd numbers are: "

sum=0
count=0
num=1

while ((count<=n))
do
	if(($num%2!=0))
	then
		echo -n "$i "
		
	fi
done
sum=`expr $sum + $i`
avg=`expr $sum/$n`
echo -e "Sum: $sum \nAvg:$avg"
