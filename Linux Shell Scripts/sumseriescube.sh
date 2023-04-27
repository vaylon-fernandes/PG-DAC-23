#!/bin/bash

<<comment
24. Write a Shell Script to find the sum of the series [ x - x^3 + x^5 + ......]. 
Test Data :
Input the value of x :2
Input number of terms : 5
Expected Output :
The values of the series:
2
-8
32
-128
512
The sum = 410

comment

sum=0
cal_pow=1
pow=1
sign=-1
read -p "Enter the value of x: " x
read -p "Enter the number of terms: " terms

echo "The values of the series: "

for (( i=0; i<$terms; i++ ))
do	
	for(( j=1; j<=2*$i+1; j++ ))
	do
		cal_pow=$(( $cal_pow*$x ))
	done
	sign=$(( -$sign ))
	cal_pow=$(( $sign*$cal_pow ))
	sum=$(( $sum+$cal_pow ))
	pow=$(( $pow+2 ))
	echo "$cal_pow"
	cal_pow=1
done
echo "Sum: $sum"
