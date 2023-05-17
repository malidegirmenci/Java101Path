# Student Information System
## Course Class Properties
**Attributes** : name,code,prefix,note,Teacher
**Methods** : Course() , addTeacher() , printTeacher()
## Teacher Class Features:
**Attributes** : name,MPNo,branch
**Methods** : Teacher()
## Student Class Properties:
**Attributes** : name,stuNo,classes,course1,course2,course3,average,isPass
**Methods** : Student(), addBulkExamNote(), isPass(), calcAverage(), printNote()

## Tasks
Enter the verbal grade part of the course in the Course class and specify the effect on the average for each course separately. Include your oral grades with the percentage of impact on the average.

Example: If the effect of the oral grade of the physics course is 20% on the average, the effect of the exam grade is 80%.

If the student gets 90 from the oral and 60 from the exam, the effect of that course on the overall average is calculated as follows:

Physics Average: (90 * 0.20) + (60 * 0.80);