

def get_values(file): 
    num_lines = 0 
    list_values = []
    curr = [0, 0]
    with open(file) as f: 
        lines = f.readlines() 
    for line in lines: 
        num_lines += 1 
    # print(num_lines)
    with open(file, 'r') as afile: 
        count = 0
        sum = 0 
        for char in afile.read(): 
            if char.isdigit(): 
                if count == 0: 
                    count += 1 
                    curr[0] = char
                if count == 1: 
                    count = 0 
                    curr[1] = char 
                    curr[0] += curr[1]
                    sum += int(char[0])
                    print(curr[0])
    #print(curr)
    print(sum)


def main(): 
    get_values("C:/rit/PersonalProjects/practice_projects/adventOfCode2023/day1/values.txt")

main()