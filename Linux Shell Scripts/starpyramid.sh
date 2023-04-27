#!/bin/bash

<<comment 
14. Write a Shell Script to make such a pattern as a pyramid with an asterisk. 

   * 
  * * 
 * * * 
* * * *

comment

for (( i=0; i<=4; i++ ))
do
	for(( j=3; j>=i; j-- ))
	do
		echo -n " "
 	done
	for(( k=1; k<=i; k++))
	do
		echo -n  "* "
	done
	echo "" #print newline
done
