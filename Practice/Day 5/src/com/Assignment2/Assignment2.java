/*
 * Author       : Prasad Satpute
 * Date         : 09/03/2022
 * Program      : Create List of Student of String kind
 * Description  : 
 */
package com.Assignment2;

import com.example.Student;
import java.util.*;
import java.util.Map.Entry;

public class Assignment2 {
    
    static Scanner sc = new Scanner(System.in);
    
    
    public static int menu(){
        System.out.println("1. Create an Array of student convert it into list");
        System.out.println("2. Search specific student");
        System.out.println("3. List all odd position students");
        System.out.println("4. Replace all even position student name as \"Selected Student\"");
        System.out.println("5. Show entire list");
        System.out.println("6. Restore your original list after replacing");
        System.out.println("7. Remove all odd positing elements in list");
        System.out.println("8. Print the list");
        System.out.println("9. Restore your original list ");
        System.out.println("10. Print entire list again ");
        return sc.nextInt();
    }
    
    public static void main(String[] args) {
        
        Student s[] = new Student[10];
        s[0] = new Student(1, "Akshay", 98.66);
        s[1] = new Student(2, "Anshuman", 89.66);
        s[2] = new Student(3, "Isahan", 78.66);
        s[3] = new Student(4, "Kuldeep", 96.66);
        s[4] = new Student(5, "Ashima", 88.66);
        s[5] = new Student(6, "Satbir", 85.66);
        s[6] = new Student(7, "Ravi", 96.66);
        s[7] = new Student(8, "Sumeet", 74.66);
        s[8] = new Student(9, "Pooja", 78.66);
        s[9] = new Student(10, "Pravin", 76.66);
        
        List<Student> StudentList = new ArrayList<Student>();
        
        List<Student> CloneStudentList = new ArrayList<Student>();
        CloneStudentList = StudentList;
        
        int choice;
        while ((choice = menu()) != 0) {            
            switch(choice){
                case 1 :
                {
                    
        
                    for(Student stud:s)
                    {
                        StudentList.add(stud);
                    }

                    for(Student stud:StudentList)
                    {
                        System.out.println("Roll no."+stud.getRollno());
                        System.out.println("Name"+stud.getName());
                        System.out.println("Percentage"+stud.getPercentage());
                    }

                    System.out.println("-----------------------------------");
                    break;
                }
                case 2 :
                {
                    Map<Integer,String> studentMap = new HashMap<Integer, String>();
                        for(Student stud:StudentList)
                        {
                            studentMap.put(stud.getRollno(),stud.getName());
                        }
                        String specificstudent;
                        System.out.println("Enter Student Name For Search : ");

                        String searchName = sc.nextLine();

                        // iterate each entry of hashmap
                        for(Entry<Integer,String> entry: studentMap.entrySet()){
                            // if give value is equal to value from entry
                            // print the corresponding key
                            if((entry.getValue()).equals(searchName)){
                                System.out.println("Name = "+entry.getValue());
                                break;
                            }
                        }

                        System.out.println("-----------------------------------");
                        break;
                }
                
                case 3 :
                {
                    int oddPosition = 0;
                        for(int i =  oddPosition; oddPosition <= 9; oddPosition=oddPosition+2)
                        {

                            System.out.println(StudentList.get(oddPosition).getName());

                        }

                        System.out.println("-----------------------------------");
                        break;
                }
                case 4 :
                {
                    int evenPosition = 1;
                        for(int i =  evenPosition; evenPosition <= 9; evenPosition=evenPosition+2)
                        {

                            System.out.println(StudentList.get(evenPosition).getName());

                        }
                        
                        break;
                }
                
                case 5 :
                {
                    for(Student stud:StudentList)
                    {
                        System.out.println("Roll no."+stud.getRollno()+" Name = "+stud.getName()+" Percentage = "+stud.getPercentage());
                        
                    }

                    System.out.println("-----------------------------------");
                    break;
                }
            }
        }
        
        
    }
}
