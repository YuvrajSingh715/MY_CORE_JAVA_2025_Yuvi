package com.Google.langpkg.Object;

import java.util.Objects;

public class Traveling {

	int passengerId;
	String travelExp;

	public Traveling(int passengerId, String travelExp) {
		this.passengerId = passengerId;
		this.travelExp = travelExp;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getTravelExp() {
		return travelExp;
	}

	public void setTravelExp(String travelExp) {
		this.travelExp = travelExp;
	}

	@Override
	public String toString() {
		return "Trip Expenses ~> Passenger Id: " + passengerId + " && Travel Exp: " + travelExp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(passengerId, travelExp); // For Both fields
//		return Objects.hash(passengerId);            //Only for one fields
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;

		Traveling diff = (Traveling) o;

		return passengerId == diff.passengerId && Objects.equals(this.travelExp, diff.travelExp);
//		return Objects.equals(this.passengerId, diff.passengerId);
	}

}
