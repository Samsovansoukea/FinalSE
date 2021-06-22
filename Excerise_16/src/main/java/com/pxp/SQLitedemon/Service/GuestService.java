package com.pxp.SQLitedemon.Service;


import com.pxp.SQLitedemon.entity.Guest;
import com.pxp.SQLitedemon.Responsive.GuestReponsive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestReponsive Guestrepository;

    @Transactional
    public String createGuest(Guest Guest){
        try {
            if (!Guestrepository.existsByName(Guest.getName())){
                Guest.setId(null == Guestrepository.findMaxId()? 0 : Guestrepository.findMaxId() + 1);
                Guestrepository.save(Guest);
                return "Student record created successfully.";
            }else {
                return "Student already exists in the database.";
            }
        }catch (Exception e){
            throw e;
        }
    }

    public List<Guest> readGuest(){
        return Guestrepository.findAll();
    }

    @Transactional
    public String updateGuest(Guest Guest){
        if (Guestrepository.existsByName(Guest.getName())){
            try {
                List<Guest> students = Guestrepository.findByName(Guest.getName());
                students.stream().forEach(s -> {
                    Guest studentToBeUpdate = Guestrepository.findById(s.getId()).get();
                    studentToBeUpdate.setName(Guest.getName());
                    studentToBeUpdate.setNumber(Guest.getNumber());
                    studentToBeUpdate.setgetEnter_date(Guest.getEnter_date());
                    studentToBeUpdate.setgetExit_Date(Guest.getExit_date());
                    Guestrepository.save(studentToBeUpdate);
                });
                return "Student record updated.";
            }catch (Exception e){
                throw e;
            }
        }else {
            return "Student does not exists in the database.";
        }
    }

    @Transactional
    public String deleteGuest(Guest Guest){
        if (Guestrepository.existsByName(Guest.getName())){
            try {
                List<Guest> students = Guestrepository.findByName(Guest.getName());
                students.stream().forEach(s -> {
                	Guestrepository.delete(s);
                });
                return "Guest record deleted successfully.";
            }catch (Exception e){
                throw e;
            }

        }else {
            return "Guest does not exist";
        }
    }
}