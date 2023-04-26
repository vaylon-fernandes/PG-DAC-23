#!/bin/bash

read -p "Enter a number: " num

if (($num % 2 == 0))
	then
	      echo "$num is a even number"
	else
	      echo "$num is a odd number"
fi
