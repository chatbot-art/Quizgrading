package com.java.com.akshat.test.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuizController {
     @PostMapping("/gradeQuiz")
    public String gradeQuiz(@RequestBody QuizAnswersDto quizAnswers) {
        int score = 0;

        // Correct answers
        String correctAnswer1 = "4";
        String correctAnswer2 = "paris";
        String correctAnswer3 = "mars";

        // Get user answers
        String answer1 = quizAnswers.getQuestion1().toLowerCase().trim();
        String answer2 = quizAnswers.getQuestion2().toLowerCase().trim();
        String answer3 = quizAnswers.getQuestion3().toLowerCase().trim();

        // Grade the quiz
        if (answer1.equals(correctAnswer1)) {
            score++;
        }

        if (answer2.equals(correctAnswer2)) {
            score++;
        }

        if (answer3.equals(correctAnswer3)) {
            score++;
        }

        // You can store the score in a database or perform other actions here
        // For simplicity, we're returning the score as a string
        return "Your score: " + score + "/3";
    }
}
