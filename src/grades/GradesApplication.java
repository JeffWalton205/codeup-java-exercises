//package grades;
//
//import java.util.HashMap;
//import java.util.Random;
//import java.util.Scanner;
//
//public class GradesApplication {
//
//
//
//    //
//    public static void main(String[] args) {
//
//        HashMap<String, Student> students = new HashMap<>();
//
//
////        HashMap<String, Student> students = new HashMap<>();
////        Student target;
////
//        students.put ("LoneSurvivor01",  new Student("Ripley"));
////        target = students.get("LoneSurvivor01");
////        target.addGrade(100);
////        target.addGrade(100);
////        target.addGrade(100);
////
//        students.put ("Frosty1E4", new Student("Hicks"));
////        target = students.get("Frosty1E4");
////        target.addGrade(90);
////        target.addGrade(94);
////        target.addGrade(100);
////
//        students.put ("CorporateSuit00", new Student("Burke"));
////        target = students.get("CorporateSuit00");
////        target.addGrade(40);
////        target.addGrade(20);
////        target.addGrade(0);
////
//        students.put ("BugHunter69", new Student("Hudson"));
////        target = students.get("BugHunter69");
////        target.addGrade(69);
////        target.addGrade(80);
////        target.addGrade(100);
//
//        Random random = new Random();
//        for(int i = 0; i < 4; i++) {
//            students.get("LoneSurvivor01").addGrade(random.nextInt(100));
//            students.get("Frosty1E4").addGrade(random.nextInt(100));
//            students.get("CorporateSuit00").addGrade(random.nextInt(100));
//            students.get("BugHunter69").addGrade(random.nextInt(100));
//        }
//
//        System.out.println("\n\n\tWelcome!\n\n\tHere are the Github user names of our students\n");
//        System.out.println(students.keySet());
//
//
//        Scanner scanner = new Scanner(System.in);
//        Input.setScanner(scanner);
////        String userInput;
////        System.out.println("\tWelcome to the Weyland-Yutani Personnel Database");
////        System.out.println("Current records on file:");
////        System.out.println(students.keySet());
//
////        Scanner scanner = new Scanner(System.in);
////
////
////        //Student 1
////        Student ripley = new Student("Ripley");
////        ripley.addGrade(90);
////        ripley.addGrade(100);
////        ripley.addGrade(85);
////
////        //Student 2
////        Student hicks = new Student("Hicks");
////        hicks.addGrade(80);
////        hicks.addGrade(90);
////        hicks.addGrade(100);
////
////        //Student 3
////        Student burke = new Student("Burke");
////        burke.addGrade(40);
////        burke.addGrade(20);
////        burke.addGrade(0);
////
////        //Student 4
////        Student hudson = new Student("Hudson");
////        hudson.addGrade(80);
////        hudson.addGrade(90);
////        hudson.addGrade(100);
////
////        //HashMap Initialize
////        HashMap<String, Student> students = new HashMap<>();
////
////        students.put("LoneSurvivor01", ripley);
////        students.put("Frosty1E4", hicks);
////        students.put("CorporateShill00", burke);
////        students.put("BugHunter69", hudson);
////
////        System.out.println("\n\n\n                       Welcome to the Weyland-Yutani Personnel Database!\nCurrent Files on Record:\n");
////        students.forEach((key, value) -> System.out.println(key));
////
////        String userInput = "";
////        int userContinue = 1;
////
////        do {
////
////            do {
////                if (userInput != "") {
////                    System.out.println("No records found.");
////                }
////                System.out.println("Enter username to access records\n");
////                userInput = scanner.next();
////            } while (!students.containsKey(userInput));
////
////            System.out.println(students.get((userInput).name()));
////
////        }
//    }
//}
//
