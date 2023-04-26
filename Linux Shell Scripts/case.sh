read -p "Enter first number: " num1
read -p "Enter second number:-  " num2 
read -p "Choose your operation (+, -,/,*,%):- " operation

case $operation in 
	"+") 
	sum=`expr $num1 + $num2`
	echo "SUM: $sum"
	;;
	"-")
	difference=`expr $num1 - $num2`
	echo "Difference: $difference"
	;;
	"/")
	division=`expr $num1 / $num2`
	echo "Division: $division"
	;;
	"*")
	multiplication=`expr $num1 \* $num2`
	echo "Multiplication: $multiplication"
	;;
	"%")
	remainder=`expr $num1 % $num2`
	echo "Remainder: $remainder"
	;;
	*)
	echo "Invalid Input"
	;;
esac



