'''
Thoughts: 

Make a class for Student 
    would allow for calculating overall GPA 

Make a class for course
    allow for getting gpa quality points for course 

Make a func/class for grades 
    input number of assignments, weight, grade, returns 
    grade for the class, possibly with reference from 
    syllabus to what grade correspond to letter grade

Make globals for past semesters? 
    so that can just be passed in? maybe? 
    or store in some other way
'''
GRADES = ['A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D', 'F', 'NG']

QUALITY_POINTS = {
    GRADES[0]: 4.0,
    GRADES[1]: 3.67,
    GRADES[2]: 3.33,
    GRADES[3]: 3.0,
    GRADES[4]: 2.67,
    GRADES[5]: 2.33,
    GRADES[6]: 2.0,
    GRADES[7]: 1.67,
    GRADES[8]: 1.0,
    GRADES[9]: 0,
    GRADES[10]: 0 # no grade
}

class Course: 
    __slots__ = ['__name', '__credits', '__grade'] 

    def __init__(self, name, credits, grade): 
        self.__name = name 
        self.__credits = credits 
        self.__grade = grade 

    def get_credits(self): 
        return self.__credits 

    def get_grade(self): 
        return self.__grade

    def __repr__(self) -> str:
        return '\n\t' + 'Course: ' + str(self.__name) + '\n\tCredits: ' + \
        str(self.__credits) + '\n\tGrade: ' + str(self.__grade) + '\n'

class Student: 
    __slots__ = ['__id', '__name', '__credits', '__courses']

    def __init__(self, id, name): 
        self.__id = id 
        self.__name = name 
        self.__credits = 0 
        self.__courses = []

    def get_id(self): 
        return self.__id

    def get_name(self): 
        return self.__name 

    def get_credits(self): 
        return self.__credits 

    def get_gpa(self): 
        total_quality_points = 0 
        total_credits = 0 
        gpa = 0 
        for course in self.__courses: 
            total_credits += course.get_credits() 
            total_quality_points += QUALITY_POINTS[course.get_grade()] * course.get_credits()
        if total_credits > 0: 
            gpa = total_quality_points / total_credits 
        return gpa
    
    def add_course(self, course:Course): 
        self.__courses.append(course) 
        self.__credits += course.get_credits()