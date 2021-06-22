package com.pxp.SQLitedemon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
public class Guest {
	@Id
    private int id;

    private String name;
    
    private int Number;
    
    private String Member;
    
    private String Enter_Date;
    
    private String Exit_Date;
    
    public Guest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        this.Number = number;
    }
    
    public String getMember() {
        return Member;
    }

    public void setMember(String Member) {
        this.Member = Member;
    }
    
    public String getEnter_date() {
        return Enter_Date;
    }

    public void setgetEnter_date(String getEnter_date) {
        this.Enter_Date = getEnter_date;
    }
    
    public String getExit_date() {
        return Exit_Date;
    }

    public void setgetExit_Date(String getExit_Datee) {
        this.Exit_Date= getExit_date();
    }
    
    

    @Override
    public String toString() {
    	return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Member='" + Member + '\''+"Number='" + Number + '\''+"Enter_date='" + Enter_Date + '\''+"Exit_date='" + Exit_Date + '\''
                ;
}
}
    

