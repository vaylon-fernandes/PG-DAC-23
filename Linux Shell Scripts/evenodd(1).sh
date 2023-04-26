#!/bin/bash

<<comment
D. Write a program to check whether the number is even or odd?
comment

read -p "Enter a number: " num

if (($num % 2 == 0))
	then
	      echo "$num is a even number"
	else
	      echo "$num is a odd number"
fi
