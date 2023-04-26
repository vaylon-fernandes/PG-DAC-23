#!/bin/bash
echo "Enter number of files to create"
read num

for ((i=1; i<=num; i++))
do
    touch $i.txt
done
