/**
 * 
 */
package com.bridgelabz.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
public class Vehicle {
 private String Company;
 private int vehicleNum;
 @Autowired
 @Qualifier("car1")
 private Car car;
/**
 * @return the car
 */
public Car getCar() {
	return car;
}
/**
 * @param car the car to set
 */
public void setCar(Car car) {
	this.car = car;
}
/**
 * @return the company
 */
public String getCompany() {
	return Company;
}
/**
 * @param company the company to set
 */
public void setCompany(String company) {
	Company = company;
}
/**
 * @return the vehicleNum
 */
public int getVehicleNum() {
	return vehicleNum;
}
/**
 * @param vehicleNum the vehicleNum to set
 */
public void setVehicleNum(int vehicleNum) {
	this.vehicleNum = vehicleNum;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Vehicle [Company=" + Company + ", vehicleNum=" + vehicleNum + "]";
}
 
}
