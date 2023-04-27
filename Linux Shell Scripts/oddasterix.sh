#!/bin/bash
<<comment
20. Write a Shell Script to display the pattern as a pyramid using asterisks, with each row containing an odd number of asterisks. 

   *
  ***
 *****

comment

for(( i=0; i<5; i=$i+2 )) 
do
	for(( j=5; j>i; j=$j-2 ))
	do
		echo -n " "
	done
	for(( k=0; k<=i; k++ ))
	do
		echo -n "*"
	done
	echo ""
done
