#Note :
#	let an hiker, who have an habit of counting its steps while
# 	hiking 
#	for every step (Step) it was noted if it was an uphill(U)
#	or
#	a downhill(D) step
#	Remark :
#		Hikes always start and end at sealevel
#		Each step up or down represent a 1Unit of change in altitude
#		mean U = +1 unit alitude
#		and D = -1 unit alitude to present alitude
#	More terms:
#	->mountain is a sequence of consecutive steps above sea level,
#	-->which start and end at sea level
#	-> a valley is sequence of consective steps below level,
#	--> which starting with a step down form sea end at sea level
#Given : SEQUENCE OF UP AND DOWN STEPS DURING A HIKE 
#--> FIND AND PRINT THE NO. OF VALLEYS WALKED THROUGH
import math
def countingValleys(steps,path):#return no of valleys :int 
#	Where step is integer and Path is String
	altitude= 0
	valley =0
	stillInValley = False
	for i in range(steps):
		if path[i] == "U":
			altitude+=1
		else:
			altitude-=1
	#	print(f"Current :Alitude {altitude}")
		if altitude<0 and stillInValley==False:
			stillInValley=True
	#		print("In valley")
			valley+=1
		elif altitude>=0 and stillInValley ==True:
			stillInValley =False
	return math.floor(valley)
x = countingValleys(8,"DDUUUUDD")
print(x)
			
		
