# TO DO :
#	Emma(A girl playing a game)
#	
#	Game constraints :
#	--> clouds (two type : 1.thuderheads and 2. CUMULUS)
#	---> she can jump  on any cumulus cloud having a no. that is equal to
#	number of current cloud plus 1 0r 2.
#	--> (remark) avoid thuderheaded clouds
#	
#	Given :
# 	binary array{arrayOfZeroOrOne} 
#	where one denote thudercloud and zero denote cumulus cloud.
#	avoid 1's 
#	<Remark> There will always be success condition
# 	Return :
#	Print minimum no. of jumps
import math
def jumpingOnClouds(c):
	min_jumps=0
	r = len(c)
	iteration =0
	while(True):
		if iteration>=r-1:
			break
		elif iteration==r-2:
			min_jumps+=1
			iteration+=1
		if c[iteration+2]==0:
			min_jumps+=1
			iteration+=2
		else :
			min_jumps+=1
			iteration+=1
	return math.floor(min_jumps)
x=jumpingOnClouds([0,0,0,0,1,0])
print(x)			
		
