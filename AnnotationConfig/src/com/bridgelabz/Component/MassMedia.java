/**
 * 
 */
package com.bridgelabz.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * purpose 
 *@author Chaithra-Shenoy
 *@date
 *@project_name
 * 
 */
@Component//MassMedia massMedia=new MassMedia();
public class MassMedia {
	@Value("Sports")
 private String Category;
	@Autowired
 private NewsPaper newsPaper;
/**
 * @return the category
 */
public String getCategory() {
	return Category;
}
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	Category = category;
}
/**
 * @return the newsPaper
 */
public NewsPaper getNewsPaper() {
	return newsPaper;
}
/**
 * @param newsPaper the newsPaper to set
 */
public void setNewsPaper(NewsPaper newsPaper) {
	this.newsPaper = newsPaper;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "MassMedia [Category=" + Category + "]";
}
}
