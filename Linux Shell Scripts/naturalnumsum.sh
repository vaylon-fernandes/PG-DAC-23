#!/bin/bash
<<comment
2. Write a Shell Script to compute the sum of the first 10 natural numbers.
comment

sum=0
for i in {1..10}
do 
sum=`expr $sum + $i`
done
echo "Sum of first 10 naturl numbers is $sum"
