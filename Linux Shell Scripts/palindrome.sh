#!/bin/bash
<<comment
38. Write a Shell Script to check whether a number is a palindrome or not. 
Test Data :
Input a number: 121
Expected Output :
121 is a palindrome number.
comment

echo "Input a number: "
read num
temp=$num
sum=0
while(( num!=0 ))
do
	sum=$(( $(( $sum * 10 )) + $(( $num % 10 ))))
	num=$(( $num / 10 ))
done

if (( $temp == $sum ))
then
	echo -n "$temp is a palindrome number."
else
	echo -n "Not a palindrome number."
fi
echo ""
