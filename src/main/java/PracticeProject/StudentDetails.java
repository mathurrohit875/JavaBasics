package PracticeProject;

import java.util.*;

public class StudentDetails {

  public static void main(String[] args) {
    Student s1 = new Student("Rohit", 1);
    Student s2 = new Student("Mohit", 2);
    Student s3 = new Student("Sohit", 3);


    List<StudentEnrollment> list = new ArrayList<>();
    list.add(new StudentEnrollment("History", 25));
    list.add(new StudentEnrollment("Biology", 35));

    List<StudentEnrollment> list2 = new ArrayList<>();
    list2.add(new StudentEnrollment("History", 45));
    list2.add(new StudentEnrollment("Biology", 55));

    List<StudentEnrollment> list3 = new ArrayList<>();
    list3.add(new StudentEnrollment("History", 65));
    list3.add(new StudentEnrollment("Biology", 75));
    HashMap<Student, List<StudentEnrollment>> studentMap = new HashMap<>();
    studentMap.put(s1, list);
    studentMap.put(s2, list2);
    studentMap.put(s3, list3);
    Map<String, Map<String, Integer>> subjectTopperMap = new HashMap<>();
    sumAverage(subjectTopperMap, studentMap);
    toppers(subjectTopperMap);
  }

  public static void sumAverage(Map<String, Map<String, Integer>> subjectTopperMap, HashMap<Student, List<StudentEnrollment>> studentMap) {
    for (var mapEntry : studentMap.entrySet()) {
      Student s = mapEntry.getKey();
      System.out.println(s.name() + ": " + s.ID());
      List<StudentEnrollment> course = mapEntry.getValue();
      List<Integer> listGrade = new ArrayList<>();
      boolean hasFailed = false;
      for (StudentEnrollment enrollment : course) {
        System.out.println(enrollment.courseName() + ": " + enrollment.grade());
        listGrade.add(enrollment.grade());
        subjectTopperMap
              .computeIfAbsent(enrollment.courseName(), k -> new HashMap<>())
              .put(s.name(), enrollment.grade());
        if (enrollment.grade() < 50) {
          System.out.println("less than 50 marks");
          hasFailed = true;
        }
      }
      System.out.println(listGrade);
      int sum = listGrade
            .stream()
            .mapToInt(Integer::intValue)
            .sum();
      System.out.println("sum of marks: " + sum);
      OptionalDouble average = listGrade
            .stream()
            .mapToInt(Integer::intValue)
            .average();
      average
            .ifPresent(avg -> System.out.println("Average: " + avg));
      listGrade
            .stream()
            .max(Comparator.comparing(Integer::intValue))
            .ifPresent(n -> System.out.println("max score: " + n));
      System.out.println(hasFailed ? "Failed Student" : "Passed Student");
      System.out.println("-----------------------------------------------");
    }
  }

  public static void toppers(Map<String, Map<String, Integer>> subjectTopperMap) {
    for (var subjectEntry : subjectTopperMap.entrySet()) {
      String subject = subjectEntry.getKey();
      Map<String, Integer> studentGrades = subjectEntry.getValue();
      System.out.println(studentGrades);
      int highest = studentGrades.values().stream().max(Integer::compare).orElse(0);
      List<String> toppers = studentGrades.entrySet().stream()
            .filter(n -> n.getValue() == highest)
            .map(Map.Entry::getKey)
            .toList();
      System.out.println("Subject: " + subject);
      System.out.println("Highest Marks: " + highest);
      System.out.println("Topper(s): " + String.join(", ", toppers));
    }
  }
}
