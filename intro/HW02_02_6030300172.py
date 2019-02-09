def get(x,Sum="",Arr=[0]):  #แปลงฐานทศนิยม เป็น 2 
    Sum+=str(int((x*2)//1)) #พารามิเตอที่เข้ามา มาทำการคูณ2
    x=float(( "%.3f" %((x*2)%1))) #พารามิเตอที่เข้ามา มาทำการคูณ2 แล้ว mod2 แล้วเอาทศนิยม 3 ตำแหน่ง
    if(x in Arr): #เช็คถ้ามีค่าทีซ้ำให้retrun
        return Sum
    Arr.append(x)  #เก็บค่าเข้า ArrayList
    return get(x,Sum,Arr)#เรียกใช้ Recursive funtion ใหม่


    
Data=float(input("Input real number : ")) #รับค่าเป็นทศนิยม
n = 0 if Data>=0 else 1 #ถ้า x>= 0 y=0 ถ้าน้อยกว่า y=1  

A,B= map(int,(str(abs(Data)).split("."))) # แยกจำนวนเต็มกับทศนิยม


A1=(bin(int(A))[2:]) # แปลงจำนวนเต็ฒเป็นฐาน 2
C1=(len(str(A1))-1)+127 #หาตำขนาดของจำนวนเต็ม-1 +127 จาก 1101 = 1.101 *10^3 เลขชี้กำลังเท่ากับ 3 และ len(1101)-1 ก็เท่ากับ 3 
C1=(bin(int(C1))[2:]) #นำค่าที่ + 127 มาแปลงเป็นฐาน 2 
C2=(A1+get(float("0."+str(B))))[1:] #นำจำนวนที่แปลงเป็นฐาน2 รวมกัน

while(len(C2)!=23 ): #ถ้าบิตไม่ครบ23 ให้บวก 0 จนครบ 23 บิต
    C2+="0"



print("Output1 sign :",n) #แสดงค่า n ว่าเป็น 0 หรือ 1
print("Output1 expo :",C1) #แสดงค่า C1 ที่มาจากการคำนวน
print("Output1 mantissa :",C2) #แสดงค่า C2 ที่มาจากการคำนวน
print("Output1 RAW :",n,C1,C2) #แสดงค่า n C1 C2 รวมกัน




