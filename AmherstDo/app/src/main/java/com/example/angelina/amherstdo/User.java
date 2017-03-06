package com.example.angelina.amherstdo;

import java.util.ArrayList;

public class User {
	public String title;
	public String description;
	public String priority;
	public boolean selected =false;

	public User(String title, String description, String priority) {
		this.title = title;
		this.description = description;
		this.priority=priority;

	}
    public boolean isSelected(){ return selected;}
	public void setSelected(boolean selected){this.selected=selected;};

	public static ArrayList<User> getUsers() {
		ArrayList<User> events = new ArrayList<User>();
		events.add(new User("Class", "class at 9am","1"));
		events.add(new User("Lunch", "Lunch Break Cardio Class","2"));
		events.add(new User("Meeting", "Meeting for Group Project","3"));
		return events;
	}
}
