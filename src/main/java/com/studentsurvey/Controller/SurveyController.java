package com.studentsurvey.Controller;

import com.studentsurvey.Entity.Survey;
import com.studentsurvey.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;
    
    @PostMapping("create")
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey){

        return new ResponseEntity<>(surveyService.createSurvey(survey), HttpStatus.CREATED);
    }

    @PutMapping("update")
    public ResponseEntity<Survey> updateSurvey(@RequestBody Survey survey){

        return new ResponseEntity<>(surveyService.updateSurvey(survey), HttpStatus.OK);
    }

    @GetMapping("{email}")
    public ResponseEntity<Survey> findSurvey(@PathVariable("email") String email){

        return new ResponseEntity<>(surveyService.findSurveyByEmail(email), HttpStatus.OK);
    }

    @DeleteMapping("{email}")
    public ResponseEntity<String> deleteSurvey(@PathVariable("email") String email){
    surveyService.deleteSurvey(email);
        return new ResponseEntity<>("Survey deleted!", HttpStatus.OK);
    }

}
