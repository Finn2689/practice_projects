
def find_max(file): 
    count = 0 
    total = 0
    with open(file) as f: 
        lines = f.readlines()
    for line in lines:
        line = line.strip()
        if line == "":  
            #current = int(line) 
            #count = current + count
            #print("hi")
            if count >= total: 
                total = count 
                count = 0
        else: 
            #print(line)
            count += int(line)
    print(total)

def find_highest(): 
    with open("day1/calories.txt") as file: 
        file = file.readlines() 
    calories = [] 
    count = 0
    for line in file: 
        if line != "\n": 
            count += int(line)
        else: 
            calories.append(count)
            count = 0 
    calories.sort(reverse=True)
    print("Calories carried by top elf: ", calories[0])
    topthree = calories[0] + calories[1] + calories[2]
    print("Calories carried by top three elves: ", topthree)

def main(): 
    #find_max("C:/rit/PersonalProjects/practice_projects/adventOfCode2022/day1/calories.txt")
    find_highest()

main() 