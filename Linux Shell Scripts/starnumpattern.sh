#!/bin/bash

<<comment 
10. Write a Shell Script to display a pattern like a right angle triangle with a number. 

The pattern like :

1
12
123
1234
comment

for (( i=1; i<=4; i++ ))
do
	for(( j=1; j<=i; j++ ))
	do
		echo -n  "$j"
 	done
	echo "" #print newline
done
