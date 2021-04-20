package Problem2;

import java.time.LocalDate;
import java.time.Period;

class HeartRate {
	private final double LB = 0.5; // Lower Boundary
	private final double UB = 0.85; // Upper Boundary
	private final double RHR = 70; // Resting Heart Rate
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public HeartRate(String firstName, String lastName, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;

	}

	public int calculateAge(LocalDate birthday) {
		LocalDate today = LocalDate.now();
		Period bd = Period.between(birthday, today);
		return bd.getYears();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double maxHeartRate() {

		return 220 - calculateAge(dob);
	}

	public String targetHeartRateRange() {
		double AHR, LBTHR, UBTHR;
		AHR = maxHeartRate() - RHR; // calculating Average Heart Rate
		LBTHR = (AHR * LB) + RHR; // calculating Lower Boundary Target Heart Rate
		UBTHR = (AHR * UB) + RHR; // calculating Upper Boundary Target Heart Rate
		return "\nThe Target Heart Range is between " + LBTHR + " and " + UBTHR;
	}

	public String toString() {
		return targetHeartRateRange() + "\nFirst name :" + getFirstName() + "\n" + "Last name :" + getLastName()
				+ "\nAge: " + calculateAge(dob) + "\nDate of Birth: " + getDob() + "\nMaximum Heart Rate: "
				+ maxHeartRate();
	}
}
