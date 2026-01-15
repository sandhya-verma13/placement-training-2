class Signal:
    def latest_avg(self,signal):
        lst=[signal.split(",")]
        re=[]
        if not signal.strip():    
            return "No signal data provided"
        
        for i in lst:
            if i!="--" and i!="error" and i!="":
                re.append(float(i))
        if not re:        
            return "No valid signal values found"
        if not lst:
            return False    
        
        si=len(re)
        avg=0.0
        if si<=3:
            avg=sum(re)/si
        else:
            temp=0
            for j in re:
                temp+=float(j)
            avg=temp/si
        return avg

sig=input("Enter the Signal : ")
sc=Signal()
print(sc.latest_avg(sig))
