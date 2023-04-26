#!/bin/bash

<<comment
36. Write a Shell Script to display a such a pattern for n rows using a number that starts with 1 and each row will have a 1 as the first a>

  1
 121
12321
comment

for(( i=0; i<4; i++ ))
do
        for(( j=3; j>=i; j-- ))
        do 
                echo -n " "
        done
        for(( j=1; j<=i; j++ ))
        do
                echo -n "$j"
        done
	for(( j=1; j<=i; j++))
	do
		echo -n "$j"
	done
echo ""
done


