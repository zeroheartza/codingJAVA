def natural_number(data):
    data=data[::-1]
    Sum=0
    for i in range(len(data)):
        Sum+=int(data[i])*(2**i)
    return Sum




def signed_integer(data):
    n=data[0]
    data=data[1::][::-1]
    Sum=0
    for i in range(len(data)):
        Sum+=int(data[i])*(2**i)
    if n=="1":
        return Sum-128
    return Sum

def character(data):
    return  chr(natural_number(data))

def Hex(data):
    Sum="" 
    Get = { "0":"0","1" : "1","2":"2","3":"3","4":"4","5":"5","6":"6","7":"7","8":"8","9":"9","10":"A","11":"B","12":"C","13":"D","14":"E","15":"F"}
    for i in range(len(data)//4):
        Sum+=Get[str(natural_number(data[(i)*4:(i+1)*4:]))]
    return "0x"+Sum

data=input("Input 8Bit Binary: ")
print("Output1 natural number: %d"%natural_number(data))
print("Output2 signed integer: %d"%signed_integer(data))
print("Output3 character: %s"%character(data))
print("Output4 HEX: %s"%Hex(data))
