#!/bin/bash

<<comment 
9. Write a Shell Script to display a pattern like a right angle triangle using an asterisk. 

The pattern like :

*
**
***
****
comment

for (( i=0; i<4; i++ ))
do
	for(( j=0; j<=i; j++ ))
	do
		echo -n  "*"
 	done
	echo "" #print newline
done
