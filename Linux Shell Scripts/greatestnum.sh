#!/bin/bash

read -p "Enter 3 numbers: " num1 num2 num3
if [ $num1 -gt $num2 ]
	then
	if [ $num1 -gt $num3 ]
	then
		echo "$num1 is the greatest number"
	else
		echo "$num3 is the greatest number" 
	fi
else
	if [ $num2 -gt $num3 ]
	then 
		echo "$num2 is the greatest number"
	else
		echo "$num3 is the greatest number" 
	fi
fi
