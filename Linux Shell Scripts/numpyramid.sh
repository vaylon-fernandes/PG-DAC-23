#!/bin/bash

<<comment 
13. Write a Shell Script to make a pyramid pattern with numbers increased by 1. 

   1 
  2 3 
 4 5 6 
7 8 9 10 

comment

temp=1
for (( i=0; i<=4; i++ ))
do
	for(( j=3; j>=i; j-- ))
	do
		echo -n " "
 	done
	for(( k=1; k<=i; k++))
	do
		echo -n "$temp "
		temp=$(( $temp+1 ))
	done
	echo "" #print newline
done
