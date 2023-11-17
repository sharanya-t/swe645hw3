package com.studentsurvey.Service;

import com.studentsurvey.Entity.Survey;

public interface SurveyService {

    Survey createSurvey(Survey survey);

    Survey updateSurvey(Survey survey);

    Survey findSurveyByEmail(String email);

    void deleteSurvey(String email);

}
