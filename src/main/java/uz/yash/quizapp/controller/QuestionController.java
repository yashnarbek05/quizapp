package uz.yash.quizapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.yash.quizapp.dto.QuestionDTO;
import uz.yash.quizapp.model.Question;
import uz.yash.quizapp.service.QuestionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("question")
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{name}")
    public List<Question> getAllQuestions(@PathVariable String name){
        return questionService.getAllQuestionsByCategory(name);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody QuestionDTO questionDTO){
        return questionService.addQuestion(questionDTO);
    }
}
