class Student_Report {

public static void main (String[ ] args) {

String name, clg, dept, status;
int sem, math, java, DS, OS, CP, Git, total, avg, needed;

System.out.println("=================================================");
System.out.println("================STUDENT ACADEMIC REPORT==============");
System.out.println("=================================================");

name = "Lakshh"; clg = "CIT" ; sem = 3; dept = "CSE";

System.out.println("Name : "+name);
System.out.println("College: "+clg);
System.out.println("Semester : "+sem);
System.out.println("Department: "+dept);

math=98; java=94; DS=98; OS=96; CP=100; Git=100;

total=math+java+DS+OS+CP+Git;
avg=total/6;
needed=600-total;
status="PASS";

System.out.println("--------------------------SUBJECT MARKS--------------------------");
System.out.println("Mathematics: "+math);
System.out.println("Java: "+java);
System.out.println("DS: "+DS);
System.out.println("OS : "+OS);
System.out.println("CP : "+CP);
System.out.println("Git : "+Git);

System.out.println("---------------------------CALCULATIONS--------------------------");
System.out.println("Total marks : "+total);
System.out.println("Average marks : "+avg);
System.out.println("Marks needed : "+needed);

System.out.println("Status : "+status);

System.out.println("--------------------------END OF REPORT---------------------------");
System.out.println("---------------------------Keep Learning----------------------------");
}
}