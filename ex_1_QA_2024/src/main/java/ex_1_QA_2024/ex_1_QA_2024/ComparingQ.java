package ex_1_QA_2024.ex_1_QA_2024;


/**
 * Fadi Marjieh - 312312861
 * Steve Evtushenko - 315914671
 */

public class ComparingQ {

	public static String Compare(double a, double b, String mod) {
		
		switch(mod) {
		case "regulars":
			if(a<b)
				return "B";
			else return "A";
		case "negatives":
			if(-a>=-b) 
				return "A";
			else return "B";
		case "reciprocals":
			if ((1/a)>=(1/b))
				return "A";
			else return "B";
		default:
			return "Error";
		}
		
	}
}
