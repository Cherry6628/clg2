class InvalidNameException extends Exception {
public InvalidNameException(String message) {
super(message);
} }
class Validator {
boolean validateName(String name) throws InvalidNameException { if (name == null || name.isEmpty()) {
throw new InvalidNameException("Invalid name.");
}
return true;
}
boolean validateJobProfile(String jobProfile) {
String[] validProfiles = {"Associate", "Clerk", "Executive", "Officer"}; for (String profile : validProfiles) {
if (jobProfile.equalsIgnoreCase(profile)) {
return true;
}
}
return false;
}
boolean validateAge(int age) {
return age >= 18 && age <= 30;
}
void validate(Applicant applicant) throws Exception { if (!validateName(applicant.getName())) { throw new InvalidNameException("Invalid name."); }
if (!validateJobProfile(applicant.getJobProfile())) { throw new Exception("Invalid job profile."); }
if (!validateAge(applicant.getAge())) {
throw new Exception("Invalid age."); }
}
}
class Applicant {
private String name;
private String jobProfile;
private int age;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getJobProfile() {
return jobProfile;
}
public void setJobProfile(String jobProfile) {
this.jobProfile = jobProfile;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
}
public class Tester {
public static void main(String[] args) {
Applicant applicant = new Applicant();
applicant.setName("John Doe");
applicant.setJobProfile("Clerk");
applicant.setAge(25);
Validator validator = new Validator();
try {
validator.validate(applicant);
System.out.println("Application submitted successfully!"); } catch (InvalidNameException e) {
System.out.println("Error: " + e.getMessage()); } catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
