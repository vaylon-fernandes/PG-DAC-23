#!/bin/bash

<<comment
6. Write a Shell Script to display the multiplication table for a given integer. 
Test Data :
Input the number (Table to be calculated) : 15
Expected Output :
15 X 1 = 15
...
...
15 X 10 = 150
comment

read -p "Input the number (Table to be calclated) : " num
for (( i=1; i<=10 ; i++))
do
	echo "$num * $i = $(($num*$i))"
done
