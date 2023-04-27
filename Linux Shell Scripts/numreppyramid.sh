#!/bin/bash

<<comment 
17. Write a Shell Script to make such a pattern like a pyramid with a number which will repeat the number in the same row. 

   1
  2 2
 3 3 3
4 4 4 4
comment

temp=1
for (( i=0; i<4; i++ ))
do
	for(( j=3; j>=i; j-- ))
	do
		echo -n " "
 	done
	for(( k=0; k<=i; k++))
	do
		echo -n "$temp "
	done
	temp=$(( $temp+1 ))

	echo "" #print newline
done
