#!/bin/bash
<<comment
37. Write a Shell Script to display the number in reverse order. 
Test Data :
Input a number: 12345
Expected Output :
The number in reverse order is : 54321
comment

echo "Input a number: "
read num
reverse=0
while(( num!=0 ))
do
	reverse=$(( $(( $reverse * 10 )) + $(( $num % 10 ))))
	num=$(( $num / 10 ))
done
echo -n "The number in reverse order is : $reverse"
echo ""
