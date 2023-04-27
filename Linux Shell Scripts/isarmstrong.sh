#!/bin/bash
<<comment
29. Write a Shell Script to check whether a given number is an Armstrong number or not. 
Test Data :
Input a number: 153
Expected Output :
153 is an Armstrong number.
comment

echo "Input a number: "
read num
temp=$num
r=0
sum=0
while(( num>0 ))
do
	r=$(( $num % 10 ))
	sum=$(( $sum + $(( $r * $r * $r )) ))
	num=$(( $num / 10 ))
done
if(( temp == sum ))
then
	echo "$temp is an armstrong number."
else
	echo "$temp is not an armstrong number."
fi
