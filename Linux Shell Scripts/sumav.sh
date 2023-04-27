#!/bin/bash
#4. Write a Shell Script to read 10 numbers from the keyboard and find their sum and average.
sum=0
for(( i=1; i<=10; i++ ))
do 
	read -p "Enter a number ($i/10): " n
	sum=`expr $sum + $n`
done
avg=$( echo "$sum/$n"|bc )
echo -e "Sum: $sum \nAvg:$avg"
