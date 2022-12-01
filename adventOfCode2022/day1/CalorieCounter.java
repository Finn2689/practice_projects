package adventOfCode2022.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalorieCounter {
    public String filename; 

    public CalorieCounter(String file) { 
        this.filename = file; 
    }

    public int highestCalorieElf() throws FileNotFoundException { 
        Scanner scanner = new Scanner(new File(filename));
        Elf highest = new Elf(0);
        int count = 1; 
        while(scanner.hasNextLine()) { 
            
        }
        return highest.calories; 
    }

    public static void main(String[] args) throws FileNotFoundException { 
        CalorieCounter mainCal = new CalorieCounter("C:/rit/PersonalProjects/practice_projects/adventOfCode2022/day1/calories.txt");
        System.out.println(mainCal.highestCalorieElf());  
        Scanner scanner = new Scanner(new File("C:/rit/PersonalProjects/practice_projects/adventOfCode2022/day1/calories.txt"));
        while(scanner.hasNext()) { 
            // System.out.println(scanner.nextLine());
        }
    }
}
