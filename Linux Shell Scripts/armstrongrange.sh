#!/bin/bash

<<comment
30. Write a Shell Script to find the Armstrong number for a given range of number. 
Test Data :
Input starting number of range: 1
Input ending number of range : 1000
Expected Output :
Armstrong numbers in given range are: 1 153 370 371 407
comment

read -p "Input starting number: " start
read -p "Input ending number: "  end

sum=0

for(( i=$start; i<$end; i++ ))
do
	n=$i
	num=$n
	sum=0
	result=0
	while(( $num!=0 ))
	do
		digit=$(( $num%10 ))
		#echo "$digit"
		result=$(( $result+$(( $digit*$digit*$digit )) ))
		num=$(( $num/10 ))
		#echo "$result $num"
	done

	if (( $n==$result ))
	then 
		echo -n "$result "
	fi
done
echo ""

