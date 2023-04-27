#!/bin/bash

<<comment
33. Write a Shell Script to display Pascal's triangle. ____
 Test Data :
Input number of rows: 5
Expected Output :

        1
      1   1 
    1   2   1 
  1   3   3   1
1   4   6   4   1 

comment

term=1

read -p "Input number of rows: " rows

for(( i=0; i<$rows; i++ ))
do
	for(( j=1; j<=rows-i; j++ ))
	do
		echo -n " "
	done
	for(( k=0; k<=i; k++ ))
	do
		if [ $i -eq 0 ]||[ $k -eq 0 ]
		then
			term=1
		else
			term=$( echo "$term*($i-$k+1)/$k"|bc )
		fi
		echo -n "$term "
	done
	echo
done
