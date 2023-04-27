#!/bin/bash

#comment
28. Write a Shell Script to find the 'Perfect' numbers within a given number of ranges. 
Test Data :
Input the starting range or number : 1
Input the ending range of number : 50
Expected Output :
The Perfect numbers within the given range : 6 28

comment


sum=0
read -p "Enter starting number: " start
read -p "Enter ending number: " end

echo "The Perfect numbers within the given range : "

for(( num=start; num<=end; num++ ))
do
	sum=0
	for(( i=1; i<=num/2; i++ ))
	do
		if(( $num%$i==0 ))
		then
			sum=$(( $sum+$i ))
		fi
	done

	if (( $sum==$num ))
	then
		echo -n "$num "
	fi
done
echo ""
