#!/bin/bash

<<comment
27. Write a Shell Script to check whether a given number is a 'Perfect' number or not. 
Test Data :
Input the number : 56
Expected Output :
The positive divisor : 1 2 4 7 8 14 28
The sum of the divisor is : 64
So, the number is not perfect.
comment

sum=0

read -p "Enter a number: " num
echo "The positive divisor :"

for(( i=1; i<=num/2; i++ ))
do
	if(( $num%$i==0 ))
	then
		echo -n "$i "
		sum=$(( $sum+$i ))
	fi
done

echo ""
echo "The sum of the divisor is : $sum"
if (( $sum==$num ))
then 
	echo "The number is perfect!!!"
else
	echo "The number is not perfect..."
fi
