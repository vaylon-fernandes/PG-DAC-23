#!/bin/bash
31. Write a Shell Script to display a pattern like a diamond. 

    *
   *** 
  *****
 *******
********* 
 *******
  *****
   ***
    * 


for(( i=0; i<=9; i=$i+2 )) 
do
	for(( j=9; j>=i; j=$j-2 ))
	do
		echo -n " "
	done
	for(( k=0; k<=i; k++ ))
	do
		echo -n "*"
	done
	echo ""
done


for(( i=9; i>=1; i=$i-2 )) 
do
	for(( j=11; j>=$i; j=$j-2 ))
	do
		echo -n " "
	done
	for(( k=0; k<$i-2; k++ ))
	do
		echo -n "*"
	done
	echo ""
done

