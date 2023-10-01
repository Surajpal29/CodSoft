import java.util.Scanner;

public class Task2_student_grade_calculator {

    public static void main(String[] args) {
        System.out.println("###########################################################################################");
        System.out.println("###########################################################################################");
        System.out.println();
        System.out.println("\t\t\tSTUDENT GRADE CALCULATOR");
        System.out.println();
        System.out.println("###########################################################################################");
        System.out.println("###########################################################################################");
        takingInput();
    }
    static void takingInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of subjects");
        int totalSubjects=sc.nextInt();
        int []marks=new int[totalSubjects];
        for(int i=0;i<totalSubjects;i++){
            System.out.println();
            System.out.println("Enter marks obtained by the student out of 100");
            marks[i]=sc.nextInt();
            if(marks[i]>100){
                System.out.println("Marks cannot be greater than 100 please enter marks again");
                // System.out.println();
                // System.out.println("Enter marks obtained by the student out of 100");
                marks[i]=sc.nextInt();
            }
        }
        int obtainedMarks=0;
        for(int i=0;i<totalSubjects;i++){
            obtainedMarks+=marks[i];
        }
        
        grade(totalSubjects,obtainedMarks);

    }
    static void grade(int totalSubjects,int obtainedMarks){
        int totalMarks=totalSubjects*100;
        float percentage=(totalMarks/obtainedMarks)*100;
        System.out.println();
        System.out.println("Total marks obtained: "+obtainedMarks+" out of : "+totalMarks);

        System.out.print("\n GRADE :- ");
        if(percentage>94 && percentage<=100){
            System.out.println(" A+ ");
        }else if(percentage>85 && percentage<94){
            System.out.println(" A ");
        }else if(percentage>75 && percentage<85){
            System.out.println(" B+ ");
        }else if(percentage>65 && percentage<75){
            System.out.println(" B ");
        }else if(percentage>55 && percentage<65){
            System.out.println(" C+ ");
        }else if(percentage>45 && percentage<55){
            System.out.println(" C ");
        }else if(percentage>35 && percentage<45){
            System.out.println(" D ");
        }else {
            System.out.println(" F ");
        }
        
        System.out.println();
        System.out.println("if you want to find anoter student grade than press 'y' to continue otherwise press 'n' to exit");
        Scanner scc=new Scanner(System.in);
        String anotherStudentGread=scc.next();
        if(anotherStudentGread.equals("y")|| anotherStudentGread.equals("Y")){
               takingInput();
        }
    }
}