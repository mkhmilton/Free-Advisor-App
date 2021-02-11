
package ParentClass;


public abstract class Person {
	protected double avgSleepingTime, avgInternetBrowsingTime, avgMobilePhoneUsingTime, age;
	protected String sleepingResult,internetBrowsingResult,mobilePhoneUsingResult;
        
        protected abstract String getSleepingMessage();
        protected abstract String getInternetBrowsingMessage();
        protected abstract String getMobilephoneMessage();
        protected abstract String getProfession();
}
