#!/bin/bash

<<comment
39. Write a Shell Script to find the number and sum of all integers between 100 and 200 which are divisible by 9. 
Expected Output :
Numbers between 100 and 200, divisible by 9 :
108 117 126 135 144 153 162 171 180 189 198
The sum : 1683
comment

sum=0
echo "Numbers between 100 and 200, divisible by 9 :"
for(( i=100; i<=200; i++ ))
do	
	if(( i%9==0 ))
	then 
		echo -n  "$i "
		sum=$(( $sum + $i ))
	fi
done
echo ""
echo "The sum : $sum"
