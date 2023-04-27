#!/bin/bash
#4. Write a Shell Script to read 10 numbers from the keyboard and find their sum and average.
sum=0
for(( i=1; i<=10; i++ ))
do 
read -p "Enter a number: " n
echo -n "$i "
done
sum=`expr $sum + $i`
avg=`expr $sum/n`
echo -e "Sum: $sum \nAvg:$avg"
