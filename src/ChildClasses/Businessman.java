
package ChildClasses;

import Other.Profession;
import ParentClass.Person;


public class Businessman extends Person {
    Profession profession = new Profession();
    
    private double avgBusinessMeetingTime;
    private String businessMeetingTimeResult;

    public Businessman(double a, double houseWorkingTime,  double sleepingTime, double internetBrowsingTime, double mobilephoneusingTime, String p) {
        age = a;   
        avgBusinessMeetingTime = houseWorkingTime;
        avgSleepingTime = sleepingTime;
        avgInternetBrowsingTime = internetBrowsingTime;
        avgMobilePhoneUsingTime = mobilephoneusingTime;           
        profession.setProfession(p);
    }
    
    public String getWorkingMessage() {
        if (avgBusinessMeetingTime == 8) {
            businessMeetingTimeResult = "Your working time is average and that's good for your health.";
        } else if (avgBusinessMeetingTime > 8) {
            businessMeetingTimeResult = "You are working more than the average time. It would be better\nif you don't work more than 8 hours. ";
        } else if (avgBusinessMeetingTime < 8) {
            businessMeetingTimeResult = "You are working less than the average time. It would be better \nif you work at least for 8 hours.";
        }
        
        return businessMeetingTimeResult;
    }
    
    @Override
    public String getSleepingMessage() {
        if(age >= 0 && age <=3) {
            if (avgSleepingTime >= 12 && avgSleepingTime <= 14) {
                sleepingResult = "You are having average sleep and it's good for your health.";
            } else if(avgSleepingTime > 14) {
                sleepingResult = "You are having more sleep than you need. It would be better\nif you don't " + "sleep more than 14 hours.";
            } else if (avgSleepingTime < 12) {
                sleepingResult = "You are having less sleep than you need. It would be better\nif you " + "sleep at least 12 hours.";
            } else if (age > 3 && age <= 5) {
                if (avgSleepingTime >= 11 && avgSleepingTime <= 13) {
                    sleepingResult = "You are having average sleep and it's good for your health.";
                } else if(avgSleepingTime > 13) {
                    sleepingResult = "You are having more sleep than you need. It would be better\nif you don't " + "sleep more than 13 hours.";
                } else if (avgSleepingTime < 11) {
                    sleepingResult = "You are having less sleep than you need. It would be\nbetter if you " + "sleep at least 11 hours.";
                }
            }
        } else if (age > 5 && age <= 12) {
            if (avgSleepingTime >= 10 && avgSleepingTime <= 11) {
                sleepingResult = "You are having average sleep and it's good for your health.";
            } else if(avgSleepingTime > 11) {
                sleepingResult = "You are having more sleep than you need. It would be better\nif you don't " + "sleep more than 12 hours.";
            } else if (avgSleepingTime < 10) {
                sleepingResult = "You are having less sleep than you need. It would be better\nif you " + "sleep at least 11 hours.";
            }
        } else if (age > 12 && age <= 18) {
            if (avgSleepingTime >= 8.5 && avgSleepingTime <= 12) {
                sleepingResult = "You are having average sleep and it's good for your health.";
            } else if(avgSleepingTime > 12) {
                sleepingResult = "You are having more sleep than you need. It would be better\nif you don't " + "sleep more than 12 hours.";
            } else if (avgSleepingTime < 8.5) {
                sleepingResult = "You are having less sleep than you need. It would be better\nif you " + "sleep at least 8.5 hours.";
            }
        } else if (age > 18) {
            if (avgSleepingTime >= 7.5 && avgSleepingTime <= 9) {
                sleepingResult = "You are having average sleep and it's good for your health.";
            } else if(avgSleepingTime > 9) {
                sleepingResult = "You are having more sleep than you need. It would be better\nif you don't " + "sleep more than 9 hours.";
            } else if (avgSleepingTime < 7.5) {
                sleepingResult = "You are having less sleep than you need. It would be better\nif you " + "sleep at least 7.5 hours.";
            }
        }
        
        return sleepingResult;
    }

    @Override
    public String getInternetBrowsingMessage() {
        if(avgInternetBrowsingTime >= 1 && avgInternetBrowsingTime <= 8) {
            internetBrowsingResult = "Your internet browsing time is average and it's good.";
        } else if (avgInternetBrowsingTime > 8) {
            internetBrowsingResult = "You are browsing internet more than you need. It would be\nbetter " + 
                "if you don't browse internet more than 8 hour.";
        } else if (avgInternetBrowsingTime < 1) {
            internetBrowsingResult = "You are browsing internet less than you need. It would be\nbetter " + 
                "if you browse internet at least 1 hour to know the\nlatest news about the world.";
        }

        return internetBrowsingResult;
    }

    @Override
    public String getMobilephoneMessage() {
        if (avgMobilePhoneUsingTime >= 1 && avgMobilePhoneUsingTime <= 5) {
            mobilePhoneUsingResult = "Your mobilephone using time is average and it's good.";
        } else if (avgMobilePhoneUsingTime > 5) {
            mobilePhoneUsingResult = "You are using your mobilephone more than you need. It would\nbe better " + 
                "if you don't use your mobilephone more than 5 hour.";
        } else if (avgMobilePhoneUsingTime < 1) {
            mobilePhoneUsingResult = "You are using your mobilephone less than you need. It would\nbe better " + 
                "if you use your mobilephone at least 1 hour\nto know the latest features of your mobilephone.";
        }

        return mobilePhoneUsingResult;
    }

    @Override
    public String getProfession() {
        return profession.getProfession();
    }
    
}
