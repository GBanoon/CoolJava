
public class CoolJava {

	public static void main(String[] args) {
		CoolJava panda = new CoolJava();
		for (int i = -1; i <= 11; i++) {
			System.out.println(i + " " + panda.assignment1(i));
		}
	}
	public int assignment1(int input){
		 int x = 0;
		 if(input > 2) {
			 if(input < 8) {
				 x = input;
			 } else {
				 x = 10;
			 }
		 } else {
			 x = 1;
		 }
		 return x;
	}
}
//x = 1
//if(input < 8)
//else
//x = 10
//else
//x = input;
//if(input > 2)
// Als de input kleiner of gelijk aan 2 is, dan moet de functie als waarde voor x het getal 1 
//teruggeven.
// Als de input groter is dan 2 en kleiner dan 8, dan moet de functie als waarde voor x dezelfde 
//waarde als input terug geven.
// Als de input groter of gelijk is aan 8 dan geeft de functie als waarde voor x het getal 10 terug.