bit=int(input("Input bit : "))
Vcc=float(input("Input Vcc : "))
Vin=float(input("Input Vin : "))
Max=(2**bit)-1
RAW=int(Max*Vin/Vcc)
print("Output RAW : ",RAW)
DATA="%.4f"%float(RAW/Max*Vcc)
print(float(DATA),Vin)
ERROR=abs(float(DATA)-Vin)/float(DATA)*100
print("Output DATA : %s error %.4f"%(DATA,ERROR))

