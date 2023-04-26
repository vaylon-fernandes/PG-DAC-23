#!/bin/bash
<<comment
5. Write a Shell Script to display the cube of the number up to an integer. 
Test Data :
Input number of terms : 5
Expected Output :
Number is : 1 and cube of the 1 is :1
Number is : 2 and cube of the 2 is :8
Number is : 3 and cube of the 3 is :27
Number is : 4 and cube of the 4 is :64
Number is : 5 and cube of the 5 is :125
comment

read -p "Input number of terms: " num
for (( i=1; i<=$num; i++ ))
do
	echo "Number is : $i and cuber of the $i is $(($i*$i*$i))"
done


