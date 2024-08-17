package uz.yash.quizapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.yash.quizapp.dto.QuestionDTO;
import uz.yash.quizapp.mapper.QuestionMapper;
import uz.yash.quizapp.model.Question;
import uz.yash.quizapp.repository.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionRepository.findAllByCategory(category);
    }

    public String addQuestion(QuestionDTO questionDTO) {
        questionRepository.save(questionMapper.questionDTOToQuestion(questionDTO));
        return "success!";
    }
}
