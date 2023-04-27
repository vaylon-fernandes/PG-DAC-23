#!/bin/bash

<<comment
21. Write a Shell Script to display the sum of the series [ 9 + 99 + 999 + 9999 ...]. 
Test Data :
Input the number or terms :5
Expected Output :
9 99 999 9999 99999
The sum of the saries = 111105
comment


series=0
sum=0
read -p "Enter the number of terms: " terms
for(( i=1; i<=terms; i++ ))
do
	series=$(( 9 + $series*10 ))
	sum=$(( $sum+$series ))
done
echo $sum
