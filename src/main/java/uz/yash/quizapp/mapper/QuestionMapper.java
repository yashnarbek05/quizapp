package uz.yash.quizapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import uz.yash.quizapp.dto.QuestionDTO;
import uz.yash.quizapp.model.Question;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDTO questionToQuestionDTO(Question question);
    Question questionDTOToQuestion(QuestionDTO questionDTO);

    @Mapping(target = "id", ignore = true )
    void updateQuestion(QuestionDTO questionDTO, @MappingTarget Question question);
}
