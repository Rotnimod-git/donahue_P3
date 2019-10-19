import java.util.Scanner;
import java.security.SecureRandom;

public class StudyMath {
    private static double Incorrect;
    private static double Correct;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int user;

        System.out.println("Welcome to the program StudyMath.");
        System.out.println("Please choose from the following:");
        System.out.println("\tPress \"1\" for single-digit");
        System.out.println("\tPress \"2\" for two-digit");
        System.out.println("\tPress \"3\" for three-digit");
        System.out.println("\tPress \"4\" for four-digit");

        user = scnr.nextInt();

        System.out.print(user);
        System.out.println("");

        if (user == 1) {
            questionOne();
        }
        if(user == 2){
            questionTwo();
        }
        if(user == 3){
            questionThree();
        }
        if(user == 4){
            questionFour();
        }

        System.out.printf("\nCorrect: %.2f | Incorrect: %.2f\n", Correct, Incorrect);
        double percentage = (Correct / 10) * 100;
        System.out.print("Score correct: %");
        System.out.printf("%.2f\n", percentage);
        if(percentage > 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else if(percentage < 75) {
            System.out.println("Please ask your teacher for extra help.\n");
            for(int i = 0; i < 10; i++) {
                questionOne();
            }
            System.out.printf("Correct: %.2f | Incorrect: %.2f\n", Correct, Incorrect);
            percentage = (Correct / 10) * 100;
            System.out.print("Score correct: %");
            System.out.printf("%.2f", percentage);
        }
    }

    public static void questionOne () {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("Please enter your level of difficulty.");
        System.out.println("\tPress \"1\" for Addition");
        System.out.println("\tPress \"2\" for Multiplication");
        System.out.println("\tPress \"3\" for Subtraction");
        System.out.println("\tPress \"4\" for Division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d + %d?\n", randIntOne, randIntTwo);

                int math = randIntOne + randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

                int math = randIntOne * randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more";
                            break;
                        case 3:
                            negativeResponse = "Don't give up";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d - %d?\n", randIntOne, randIntTwo);

                int math = randIntOne - randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10);
                int randIntTwo = rand.nextInt(10);

                System.out.printf("What is %d / %d?\n", randIntOne, randIntTwo);

                int math = randIntOne / randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }

    public static void questionTwo () {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int user;

        System.out.println("\tPlease Enter Your Level Of Difficulty.");
        System.out.println("\tPress \"1\" for addition");
        System.out.println("\tPress \"2\" for multiplication");
        System.out.println("\tPress \"3\" for subtraction");
        System.out.println("\tPress \"4\" for division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(100);
                int randIntTwo = rand.nextInt(100);

                System.out.printf("What is %d + %d?\n", randIntOne, randIntTwo);

                int math = randIntOne + randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(100);
                int randIntTwo = rand.nextInt(100);

                System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

                int math = randIntOne * randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(100);
                int randIntTwo = rand.nextInt(100);

                System.out.printf("What is %d - %d?\n", randIntOne, randIntTwo);

                int math = randIntOne - randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don't give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(100);
                int randIntTwo = rand.nextInt(100);

                System.out.printf("What is %d / %d?\n", randIntOne, randIntTwo);

                int math = randIntOne / randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }

    public static void questionThree () {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int user;

        System.out.println("\tPlease enter your level of difficulty.");
        System.out.println("\tPress \"1\" for Addition");
        System.out.println("\tPress \"2\" for Multiplication");
        System.out.println("\tPress \"3\" for Subtraction");
        System.out.println("\tPress \"4\" for Division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(1000);
                int randIntTwo = rand.nextInt(1000);

                System.out.printf("What is %d + %d?\n", randIntOne, randIntTwo);

                int math = randIntOne + randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(1000);
                int randIntTwo = rand.nextInt(1000);

                System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

                int math = randIntOne * randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(1000);
                int randIntTwo = rand.nextInt(1000);

                System.out.printf("What is %d - %d?\n", randIntOne, randIntTwo);

                int math = randIntOne - randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(1000);
                int randIntTwo = rand.nextInt(1000);

                System.out.printf("What is %d / %d?\n", randIntOne, randIntTwo);

                int math = randIntOne / randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }

    public static void questionFour () {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int user;

        System.out.println("\tPlease enter your level of difficulty.");
        System.out.println("\tPress \"1\" for Addition");
        System.out.println("\tPress \"2\" for Multiplication");
        System.out.println("\tPress \"3\" for Subtraction");
        System.out.println("\tPress \"4\" for Division");

        user = scnr.nextInt();
        System.out.print(user);
        System.out.println("");

        if(user == 1) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10000);
                int randIntTwo = rand.nextInt(10000);

                System.out.printf("What is %d + %d?\n", randIntOne, randIntTwo);

                int math = randIntOne + randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 2) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10000);
                int randIntTwo = rand.nextInt(10000);

                System.out.printf("What is %d x %d?\n", randIntOne, randIntTwo);

                int math = randIntOne * randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 3) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10000);
                int randIntTwo = rand.nextInt(10000);

                System.out.printf("What is %d - %d?\n", randIntOne, randIntTwo);

                int math = randIntOne - randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }

        if(user == 4) {
            for (int i = 0; i < 10; i++) {
                int randIntOne = rand.nextInt(10000);
                int randIntTwo = rand.nextInt(10000);

                System.out.printf("What is %d / %d?\n", randIntOne, randIntTwo);

                int math = randIntOne / randIntTwo;
                int input = 0;

                input = scnr.nextInt();
                System.out.printf("Your answer: %d\n", input);

                if (input == math) {
                    StudyMath.Correct++;
                    int randIntThree = rand.nextInt(4);
                    int positive = randIntThree;
                    String positiveResponse;

                    switch (positive) {
                        case 1:
                            positiveResponse = "Very good!";
                            break;
                        case 2:
                            positiveResponse = "Excellent!";
                            break;
                        case 3:
                            positiveResponse = "Nice work!";
                            break;
                        default:
                            positiveResponse = "Keep up the good work!";
                            break;
                    }
                    System.out.println(positiveResponse);
                }
                else{
                    int randIntFour = rand.nextInt(4);
                    int negative = randIntFour;
                    String negativeResponse;
                    StudyMath.Incorrect++;

                    switch (negative) {
                        case 1:
                            negativeResponse = "No. Please try again.";
                            break;
                        case 2:
                            negativeResponse = "Wrong. Try once more.";
                            break;
                        case 3:
                            negativeResponse = "Don’t give up!";
                            break;
                        default:
                            negativeResponse = "No. Keep trying.";
                            break;
                    }
                    System.out.println(negativeResponse);
                }
            }
        }
    }
}