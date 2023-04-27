#!/bin/bash
<<comment
19. Write a Shell Script to display the n terms of a harmonic series and their sum. 
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
Test Data :
Input the number of terms : 5
Expected Output :
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
Sum of Series upto 5 terms : 2.283334
comment


sum=0
read -p "Enter number of terms: " terms
for(( i=1; i<=$terms; i++))
do
	echo -n "1/$i +"
	term=$( echo "scale=6;1/$i"|bc )
	sum=$( echo "scale=6;$sum+$term"|bc )
done
echo ""
echo "Sum of series: $sum"
