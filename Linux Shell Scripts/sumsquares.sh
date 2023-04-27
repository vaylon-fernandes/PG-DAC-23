	#!/bin/bash

<<comment
25. Write a Shell Script that displays the n terms of square natural numbers and their sum. 
1 4 9 16 ... n Terms
Test Data :
Input the number of terms : 5
Expected Output :
The square natural upto 5 terms are :1 4 9 16 25
The Sum of Square Natural Number upto 5 terms = 55
comment

sum=0
read -p "Enter the number of terms: " terms
echo "The squares upto $terms are " 
for(( i=1; i<=$terms; i++ ))
do
	squares=$(( $i*$i ))
	sum=$(( $sum+$squares ))
	echo -n "$squares "
done
echo "" # Print new line
echo "The Sum of Square Natural Number upto $terms terms = $sum"
