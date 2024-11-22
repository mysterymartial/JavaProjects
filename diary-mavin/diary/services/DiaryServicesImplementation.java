package services;


import data.repository.DiaryRepository;
import dto.RegisterDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServicesImplementation implements DiaryServices {
    @Autowired
    private DiaryRepository diaryRepository;
    @Override
    public String register(RegisterDetails details) {
        details.setUserName(details.getUserName());
        details.setPassword(details.getPassword());
        if(diaryRepository.findByUserName(details.getUserName())!=null){
            throw new IllegalArgumentException("Username already exists");
        }
        //diaryRepository.save(details.getUserName(),details.getPassword());
        return "Registration Successful";
    }

    @Override
    public String login(RegisterDetails details) {
        return "";
    }

    @Override
    public String logout() {
        return "";
    }
}
