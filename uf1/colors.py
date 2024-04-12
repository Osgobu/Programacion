indigo=435 
groc=570 
verd=500
vermell=645
blau=446
cian=487
taronja=615

array = ["indigo", "groc", "verd", "vermell", "blau", "cian", "taronja"]

for i in range(len(array)):
    for j in range(len(array) -i -1):
        if aray [array[j]] > aray[array[j + 1]]:
            array[j], array[j+1] = array[j+1], array[j]
print(array)