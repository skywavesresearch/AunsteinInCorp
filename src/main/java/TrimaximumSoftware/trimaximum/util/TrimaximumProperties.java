package TrimaximumSoftware.trimaximum.util;

import java.util.HashMap;
import java.util.Map;

public class TrimaximumProperties {
	
	public static String CORE_JAVA_TECH = "Core Java";
	public static String SPRING_IOC_TECH = "Spring IOC";
	public static String SPRING_MVC_TECH = "Spring MVC";
	public static String HIBERNATE_TECH = "Hibernate";
	public static String CORE_JAVA_COLLECTIONS_TECH = "Core Java Collections";
	public static String CORE_JAVA_MULTITHREADING_TECH = "Core Java Multithreading";
	public static String CORE_JAVA_GARBAGE_COLLECTIONS_TECH = "Core Java Garbage Collections";
	public static String CORE_JAVA_OOPS_TECH = "Core Java OOPS";
	public static String JSP_TECH = "JSP";
	public static String SERVLET_TECH = "Servlets";
	public static String J2EE_TECH = "J2EE";
	public static String CORE_JAVA_EXCEPTIONS_TECH = "Core Java Exceptions";
	public static String DATABASE_TECH = "Database";
	
	public static Integer CORE_JAVA_TECH_CODE = 1;
	public static Integer SPRING_IOC_TECH_CODE = 2;
	public static Integer SPRING_MVC_TECH_CODE = 3;
	public static Integer HIBERNATE_TECH_CODE = 4;
	public static Integer CORE_JAVA_COLLECTIONS_CODE = 5;
	public static Integer CORE_JAVA_MULTITHREADING_TECH_CODE = 6;
	public static Integer CORE_JAVA_GARBAGE_COLLECTIONS_TECH_CODE = 7;
	public static Integer CORE_JAVA_OOPS_TECH_CODE = 8;
	public static Integer JSP_TECH_CODE = 9;
	public static Integer SERVLET_TECH_CODE = 10;
	public static Integer J2EE_TECH_CODE = 11;
	public static Integer CORE_JAVA_EXCEPTIONS_TECH_CODE = 12;
	public static Integer DATABASE_TECH_CODE = 13;
	
	public static String FRESHER = "Fresher";
	public static String FRESHER_AND_EXPERIENCED = "Fresher and Experienced";
	public static String EXPERIENCED = "Experienced";
	public static String PROFICIENT = "Proficient";
	public static String EXPERT = "Expert";
	
	public static Integer FRESHER_CODE = 1;
	public static Integer FRESHER_AND_EXPERIENCED_CODE = 2;
	public static Integer EXPERIENCED_CODE = 3;
	public static Integer PROFICIENT_CODE = 4;
	public static Integer EXPERT_CODE = 5;
	
	public static Map<String,Integer> levelMap = new HashMap<String,Integer>();
	public static Map<String,Integer> technologyMap = new HashMap<String,Integer>();
	
	static
	{
		levelMap.put(FRESHER,FRESHER_CODE);
		levelMap.put(FRESHER_AND_EXPERIENCED,FRESHER_AND_EXPERIENCED_CODE);
		levelMap.put(EXPERIENCED,EXPERIENCED_CODE);
		levelMap.put(PROFICIENT,PROFICIENT_CODE);
		levelMap.put(EXPERT,EXPERT_CODE);
		
	}
	
	static
	{
		technologyMap.put(CORE_JAVA_TECH,CORE_JAVA_TECH_CODE);
		technologyMap.put(SPRING_IOC_TECH,SPRING_IOC_TECH_CODE);
		technologyMap.put(SPRING_MVC_TECH,SPRING_MVC_TECH_CODE);
		technologyMap.put(CORE_JAVA_COLLECTIONS_TECH,CORE_JAVA_COLLECTIONS_CODE);
		technologyMap.put(CORE_JAVA_MULTITHREADING_TECH,CORE_JAVA_MULTITHREADING_TECH_CODE);
		technologyMap.put(CORE_JAVA_GARBAGE_COLLECTIONS_TECH,CORE_JAVA_GARBAGE_COLLECTIONS_TECH_CODE);
		technologyMap.put(CORE_JAVA_OOPS_TECH,CORE_JAVA_OOPS_TECH_CODE);
		technologyMap.put(JSP_TECH,JSP_TECH_CODE);
		technologyMap.put(SERVLET_TECH,SERVLET_TECH_CODE);
		technologyMap.put(J2EE_TECH,J2EE_TECH_CODE);
		technologyMap.put(CORE_JAVA_EXCEPTIONS_TECH,CORE_JAVA_EXCEPTIONS_TECH_CODE);
		technologyMap.put(DATABASE_TECH,DATABASE_TECH_CODE);
		
	}
	
	
}
