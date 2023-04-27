#!/bin/bash

<<comment
26. Write a Shell Script to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. 
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
comment

series=0
sum=0
read -p "Enter the number of terms: " terms
for(( i=1; i<=terms; i++ ))
do
	series=$(( 1 + $series*10 ))
	if (( $i!=terms ))
	then
		echo -n "$series + "
	else
		echo -n "$series"
	fi
	sum=$(( $sum+$series ))
done
echo "" #print new line
echo $sum
