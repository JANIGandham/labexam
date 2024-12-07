package com.klef.jfsd.exam;

public class Vehicle {
	@Entity
	@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String name;
	    private String type;
	    private int maxSpeed;
	    private String color;

	    // Getters and Setters
	

}
