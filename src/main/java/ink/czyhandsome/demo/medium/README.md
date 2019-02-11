num1 = int[n]    
num2 = int[m]    
total = sorted(num1 ++ num2)    

1. (m + n) is odd:    
r = (m + n) / 2    
medium = total[r]    

2. (m + n) is even:        
r = (m + n) / 2    
medium = (total[r] + total[r - 1]) / 2    


[1, 5, 7, 8]

[2, 3, 4, 9, 11]

total = 9  
half = 4  
pivot = 2  

1. [2, 3] ++ [4, 9, 11] vs [1, 5] ++ [7, 8]  
3  4  
5  7  

2. [2, 3, 4] ++ [9, 11] vs [1] ++ [5, 7, 8]  
4  9
1  5
