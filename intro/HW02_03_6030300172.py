A=input("Input A : ")  #รับค่า A เป็น string
B=input("Input B : ")   #รับค่า B เป็น string
C=int(input("Input Cin : ")) #รับค่า Cin เป็น int
Sum=""  #string ใช้เก็บผลรับ
for i in range(len(A)): #วนloop ตามจำนวน bit ของ A
    x=int(A[len(A)-i-1])+int(B[len(A)-i-1])+C  # นำตำแหน่งของ A และ B และ Cinมาบวกกัน จากหลังไปหน้า
    C=0 #เมื่อทำการบวกแล้วให้Cin เท่ากับ 0 
    if(x==2): #กรณีบวกกันได้ 2 
        x=0   #ให้ตำแหล่งนั้นเป็น 0
        C=1   # Cin เป็น 1
    if(x==3): #กรณีบวกกันได้ 3 
        x=1   #ให้ตำแหล่งนั้นเป็น 1
        C=1   # Cin เป็น 1
    Sum+=str(x) #เอาตำแหน่งนั้นมารวมใน Sum
    
print("Output SUM : ",Sum[::-1])#แสดงผลค่าSum จากหลังไปหน้า
print("Output Cout : ",C) #แสดงผลค่า Cin ที่เหลือ
