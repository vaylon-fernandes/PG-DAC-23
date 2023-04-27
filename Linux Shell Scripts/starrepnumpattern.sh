#!/bin/bash

<<comment 
11. Write a Shell Script to make such a pattern like a right angle triangle with a number which will repeat a number in a row. 

The pattern like :

 1
 22
 333
 4444
comment

for (( i=1; i<=4; i++ ))
do
	for(( j=1; j<=i; j++ ))
	do
		echo -n  "$i"
 	done
	echo "" #print newline
done
