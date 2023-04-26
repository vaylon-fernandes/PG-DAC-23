#!/bin/bash

<<comment
29. Write a Shell Script to check whether a given number is an Armstrong number or not. 
Test Data :
Input a number: 153
Expected Output :
153 is an Armstrong number.

comment

read -p "Input a number: " num
n=$num
sum=0
result=0

while(( $n!=0 ))
do	
	digit=$(($n%10))
	result=$(( $result+$(($digit*$digit*$digit))))
	n=$(($n/10))
done

if (( $num==$result ))
then 
	echo "$num is an arstrong number"
else
	echo "$num is not an arstrong number"
fi
