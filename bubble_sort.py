n = int(input("enter array count"))
arr = [ ]
for i in range( n ):
    elem = int( input( f"enter {i} elem :") )
    arr.append( elem )

for i in range( n-1 ):
    for j in range(i+1 ,n):
        if arr[i] > arr[j] :
            temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp

print( "Sorted array : ")
print( arr )