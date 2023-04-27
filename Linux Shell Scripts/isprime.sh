#!/bin/bash
<<comment
32. Write a Shell Script to determine whether a given number is prime or not. 
 Test Data :
Input a number: 13
Expected Output :
13 is a prime number.
comment

echo "Input a number: "
read num
if(( num==1 ))
then
	echo "$num is not a prime number."
fi
flag=0
for(( j=2; j<=num/2; j++ ))
do
	if(( num%j==0 ))
	then
		echo "$num is not a prime number"
		flag=1
		break
	fi
done
if(( flag==0 && num!=1 ))
then
	echo -n "$num is a prime number"
	echo ""
fi
	
