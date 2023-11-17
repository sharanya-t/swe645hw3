package com.studentsurvey.Service.impl;

import com.studentsurvey.Entity.Survey;
import com.studentsurvey.Repository.SurveyRepository;
import com.studentsurvey.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService {

   @Autowired
   private SurveyRepository surveyRepository;

    @Override
    public Survey createSurvey(Survey survey) {
        surveyRepository.save(survey);
        return survey;
    }

    @Override
    public Survey updateSurvey(Survey survey) {
       Survey updateSurvey = surveyRepository.findByEmail(survey.getEmail());
       updateSurvey.setFirstName(survey.getFirstName());
       updateSurvey.setLastName(survey.getLastName());
       updateSurvey.setStreetAddress(survey.getStreetAddress());
       updateSurvey.setCity(survey.getCity());
       updateSurvey.setState(survey.getState());
       updateSurvey.setZip(survey.getZip());
       updateSurvey.setTelephoneNumber(survey.getTelephoneNumber());
       updateSurvey.setEmail(survey.getEmail());
       updateSurvey.setDateOfSurvey(survey.getDateOfSurvey());
       updateSurvey.setLikedMostCampus(survey.getLikedMostCampus());
       updateSurvey.setHowInterested(survey.getHowInterested());
       updateSurvey.setRecommendationLikelihood(survey.getRecommendationLikelihood());
       surveyRepository.save(updateSurvey);
       return updateSurvey;
    }

    @Override
    public Survey findSurveyByEmail(String email) {
        return surveyRepository.findByEmail(email);
    }

    @Override
    public void deleteSurvey(String email) {
        Survey survey = surveyRepository.findByEmail(email);
        surveyRepository.delete(survey);
    }
}
