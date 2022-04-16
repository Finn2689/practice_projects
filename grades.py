from gpa_calculator import * 

def main(): 
    me = Student('fmr2689', 'finn')

    gcis123 = Course('GCIS 123', 4, 'A')
    csec140 = Course('CSEC 140', 3, 'A')
    math182 = Course('MATH 182', 4, 'B')
    math190 = Course('MATH 190', 3, 'B-')
    crim299 = Course('CRIM 299', 3, 'A')
    crim210 = Course('CRIM 210', 3, 'A')
    spring22 = [gcis123, csec140, math182, math190, crim210, crim299] 

    engl325h = Course('ENGL 325H', 3, 'A') 
    crim100 = Course('CRIM 100', 3, 'A')
    crim110 = Course('CRIM 110', 3, 'A')
    anth151h = Course('ANTH 151H', 3, 'A')
    dhss103 = Course('DHSS 103', 3, 'A')
    fall21 = [engl325h, crim100, crim110, anth151h, dhss103]

    print('Fall 2021:')
    for course in fall21: 
        print(course)
        me.add_course(course)
    print('GPA=', me.get_gpa())

    print('Spring 2022')
    for course in spring22: 
        print(course)
        me.add_course(course)
    print('GPA=', me.get_gpa())

main()