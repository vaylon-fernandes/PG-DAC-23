#!/bin/bash

<<comment 
12. Write a Shell Script to make such a pattern like a right angle triangle with the number increased by 1. 

The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10
comment

temp=1
for (( i=0; i<4; i++ ))
do
	for(( j=0; j<=i; j++ ))
	do
		echo -n "$temp "
		temp=$(( $temp+1 ))
 	done
	echo "" #print newline
done
